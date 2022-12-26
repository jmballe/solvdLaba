package com.solvd.tareas.hospital.model;

import java.time.LocalDateTime;

public class Treatment {
    private String name;
    private double cost;
    private Patient patient;
    private Doctor doctor;
    private boolean payed;

    private LocalDateTime treatmentTime;

    public Treatment(String name, double cost, Patient patient, Doctor doctor, LocalDateTime treatmentTime) {
        this.name = name;
        this.cost = cost;
        this.patient = patient;
        this.doctor = doctor;
        this.payed = false;
        this.treatmentTime = treatmentTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public LocalDateTime getTreatmentTime() {
        return treatmentTime;
    }

    public void setTreatmentTime(LocalDateTime treatmentTime) {
        this.treatmentTime = treatmentTime;
    }
}
