package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;
import com.solvd.tareas.hospital.interfaces.Diagnosable;
import com.solvd.tareas.hospital.interfaces.Introducible;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Doctor extends Employee implements Diagnosable, Introducible {
    private static final Logger log = LogManager.getLogger(Doctor.class);
    private Speciality specialization;

    private List<Treatment> treatmentsDone;

    public Doctor() {}

    @Override
    public void introduce() {
        log.info("Hi! I'm doctor " + getName() + ".");
    }

    public Doctor(String name, int age, String gender, String id, LocalTime entryHour ,LocalTime leaveHour , double hourlyPayRate , Speciality specialization)
            throws InvalidAgeException, InvalidGenderException, InvalidPayRateException {
        super(name, age, gender, id, entryHour, leaveHour, hourlyPayRate);
        this.specialization = specialization;
        this.treatmentsDone = new ArrayList<Treatment>();
    }

    public Speciality getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Speciality specialization) {
        this.specialization = specialization;
    }

    public void treatPatient(Patient patient,Treatment treatment){
        patient.addTreatment(treatment);
        treatmentsDone.add(treatment);
    }

    private void givePrescription(Patient patient, String medicine){
        Prescription prescription = new Prescription(LocalDate.now(),patient,medicine,this);
        patient.addPrescription(prescription);
    }

    @Override
    public void checkPatient(Patient patient) {
        log.info("Doctor " + this.getName() + " is testing " + patient.getName() + "blood pressure and oxigen levels.");
    }

    @Override
    public String toString() {
        return "You will be treated by doctor: " + this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(specialization, doctor.specialization) &&
                getName().equals(doctor.getName())
                ;
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
