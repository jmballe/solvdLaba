package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidIdException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;
import com.solvd.tareas.hospital.interfaces.Introducible;

import java.time.LocalTime;

public class Receptionist extends Employee implements Introducible {

    public Receptionist(String name, int age, String sex, String id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate)
            throws InvalidAgeException, InvalidGenderException, InvalidPayRateException {
        super(name, age, sex, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        System.out.println("Hi! My name is " + getName() + ". I'm a receptionist.");
    }

    public void registerPatient(Hospital hospital, Patient patient) throws InvalidIdException {
        hospital.addPatient(patient);
    }

    public void patientStatus(Patient patient){
        System.out.println(patient.getStatus());
    }


}
