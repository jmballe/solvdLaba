package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;
import com.solvd.tareas.hospital.interfaces.Diagnosable;
import com.solvd.tareas.hospital.interfaces.Introducible;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;

public final class Nurse extends Employee implements Diagnosable, Introducible {
    private static final Logger log = LogManager.getLogger(Nurse.class);
    public Nurse(String name, int age, String sex, String id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate)
            throws InvalidAgeException, InvalidGenderException, InvalidPayRateException {
        super(name, age, sex, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        log.info("Hi! i'm a nurse.");
    }

    @Override
    public void checkPatient(Patient patient) {

    }
}
