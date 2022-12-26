package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidIdException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;
import com.solvd.tareas.hospital.interfaces.Introducible;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;

public class Receptionist extends Employee implements Introducible {
    private static final Logger log = LogManager.getLogger(Receptionist.class);

    public Receptionist(String name, int age, String gender, String id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate)
            throws InvalidAgeException, InvalidGenderException, InvalidPayRateException {
        super(name, age, gender, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        log.info("Hi! My name is " + getName() + ". I'm a receptionist.");
    }

    public void patientStatus(Patient patient){
        log.info(patient.getStatus());
    }

    @Override
    public String toString() {
        return "Receptionist{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receptionist receptionist = (Receptionist) o;
        return (receptionist.getUniqueID().equals(this.getUniqueID()));
    }

    @Override
    public int hashCode() {
        int id = -999999;
        try {
            id = Integer.parseInt(this.getUniqueID());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return id;
    }
}
