package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;
import com.solvd.tareas.hospital.interfaces.Diagnosable;
import com.solvd.tareas.hospital.interfaces.Introducible;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.util.Objects;

public final class Nurse extends Employee implements Diagnosable, Introducible {
    private static final Logger log = LogManager.getLogger(Nurse.class);
    public Nurse(String name, int age, String gender, String id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate)
            throws InvalidAgeException, InvalidGenderException, InvalidPayRateException {
        super(name, age, gender, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        log.info("Hi! i'm a nurse.");
    }

    @Override
    public void checkPatient(Patient patient) {
        log.info("Nurse " + this.getName() + " is testing patient" + patient.getName() + "blood pressure and oxigen levels.");
    }

    @Override
    public String toString() {
        return "Nurse{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nurse nurse = (Nurse) o;
        return (nurse.getUniqueID().equals(this.getUniqueID()));
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
