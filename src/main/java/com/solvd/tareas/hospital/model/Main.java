package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidIdException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;

public class Main {
    public static void main(String[] args) throws InvalidIdException, InvalidAgeException, InvalidGenderException, InvalidPayRateException {

        Hospital hospital = new Hospital();
        hospital.setAddress("123 Fake Street Faketown, FA 12345");
        hospital.setPhoneNumber("+5491123452345");

        for(ExampleDepartments ED : ExampleDepartments.values()) {
            hospital.addDepartments(new Department(ED.getLocation(),ED.getSpeciality()));
        }

        for (ExamplePatients EP :ExamplePatients.values()) {
            Patient patient = new Patient(EP.getName(), EP.getAge(),EP.getGender(),EP.getID(),EP.getStatus(),EP.getBeingTreatedIn());
            hospital.addPatient(patient);
            for(var department: hospital.getDeparments()) {
                if(EP.getBeingTreatedIn() == department.getSpeciality()){
                    department.addPatientDept(patient);
                }
            }
        }

        for (ExampleEmployees DE : ExampleEmployees.values()) {
            if(DE.getProfession().equals("doctor")){
                Doctor doctor = new Doctor(DE.getFullName(),DE.getAge(),DE.getGender(),DE.getID(),
                        DE.getEntryTime(),DE.getLeavingTime(),DE.getPayRate(),DE.getSpeciality());
                hospital.addDoctor(doctor);

            } else if(DE.getProfession().equals("nurse")) {

            }

        }
    }
}
