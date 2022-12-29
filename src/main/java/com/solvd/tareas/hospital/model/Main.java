package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exampleValues.ExampleDepartments;
import com.solvd.tareas.hospital.exampleValues.ExampleEmployees;
import com.solvd.tareas.hospital.exampleValues.ExamplePatients;
import com.solvd.tareas.hospital.exampleValues.ExampleTreatments;
import com.solvd.tareas.hospital.exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) {


        //Testing creating a new hospital
        Hospital hospital = new Hospital();
        hospital.setAddress("123 Fake Street Faketown, FA 12345");
        hospital.setPhoneNumber("+541123452345");

        //Testing adding departments.
        for(ExampleDepartments ED : ExampleDepartments.values()) {
            hospital.addDepartments(new Department(ED.getLocation(),ED.getSpeciality()));
        }
        //Testing adding patients.
        for (ExamplePatients EP :ExamplePatients.values()) {
            try{Patient patient = new Patient(EP.getName(), EP.getAge(),EP.getGender(),EP.getID(),EP.getStatus(),EP.getBeingTreatedIn());
            hospital.addID(patient.getUniqueID());
                for(var department: hospital.getDeparments()) {
                    if(EP.getBeingTreatedIn() == department.getSpeciality()){
                        department.addPatientDept(patient);
                    }
                }
            } catch(InvalidIdException | InvalidAgeException | InvalidGenderException e){
                log.error(e.getMessage());
            }

        }
        //Testing adding employees.
        for(ExampleEmployees DE : ExampleEmployees.values()) {
            try {
                hospital.addID(DE.getID());
                if (DE.getProfession().equals("receptionist")) {
                    Receptionist receptionist = new Receptionist(DE.getName(), DE.getAge(), DE.getGender(), DE.getID(), DE.getEntryTime(), DE.getLeavingTime(), DE.getPayRate());
                    hospital.getReception().addReceptionist(receptionist);
                } else {
                    for (Department department : hospital.getDeparments()) {
                        if (DE.getSpeciality() == department.getSpeciality()) {
                            department.addEmployee(DE.getName(), DE.getAge(), DE.getGender(), DE.getProfession(),
                                    DE.getID(), DE.getEntryTime(), DE.getLeavingTime(), DE.getPayRate(), DE.getSpeciality());
                        }
                    }
                }
            } catch (InvalidIdException | InvalidAgeException | InvalidGenderException | InvalidPayRateException e) {
                log.error(e.getMessage());
            }
        }


        //Testing stream and lambda usage.
        Map<String,String> allEmployees = hospital.allEmployees().entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().getName()));
        Map<String,String> allPatients = hospital.getAllPatients().entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().getName()));
        log.info("\nEmployees: ");
        allEmployees.forEach((k,v)-> log.info(k + ": " + v));
        log.info("\nPatients: ");
        allPatients.forEach((k,v)-> log.info(k + ": " + v));

        //Testing search
        log.info(hospital.searchPatientById("33581170"));
        log.info(hospital.searchPatientByName("Jason Dall"));

        //Testing adding treatments.
        log.info("\nTesting adding treatments.");
        var treatment1 = ExampleTreatments.TREATMENT1;
        hospital.searchDoctorById("26581590").treatPatient(hospital.searchPatientById("09184353"), treatment1.getName(),
                treatment1.getCost(), treatment1.getTreatmentTime());
        var treatment2 = ExampleTreatments.TREATMENT4;
        hospital.searchDoctorById("26581590").treatPatient(hospital.searchPatientById("39341594"), treatment2.getName(),
                treatment2.getCost(), treatment2.getTreatmentTime());

        log.info("\nTreatments done by " + hospital.searchDoctorById("26581590").getName() + ": ");
        hospital.searchDoctorById("26581590").getTreatmentsDone().forEach(t -> log.info(t.getName() + " costing " + t.getCost() + "$"));

        //Testing owned from patients.
        log.info("\nPatients owned money:");

        hospital.getAllPatients().values().forEach(p -> log.info(p.getName() +" owns " + p.getOwedMoney()));
        //Test lambda expression with stream.
        BinaryOperator<Patient> test = (x,y) -> x.getOwedMoney() > y.getOwedMoney()?x:y;
        Patient maxDebtor = hospital.getAllPatients().values().stream().reduce(test).orElse(null);
        log.info("\nThe patient with the biggest debt is " + maxDebtor.getName() + " who owns " + maxDebtor.getOwedMoney());

        //Testing payment
        log.info("\nThe hospital has " + hospital.getReserve());
        try {
            hospital.searchPatientById("09184353").payCharges(hospital);
        } catch (InvalidPaymentException e){
            log.error(e.getMessage());
        }
        log.info("The hospital has " + hospital.getReserve());

        log.info("\nPatients owned money:");
        hospital.getAllPatients().values().forEach(p -> log.info(p.getName() +" owns " + p.getOwedMoney()));
    }
}
