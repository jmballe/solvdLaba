package com.solvd.tareas.hospital.model;

import java.time.LocalDate;
import java.util.Date;

public class Prescription {
    private LocalDate date;
    private String pacientName;
    private String medicine;
    private String doctorName;

    public Prescription(LocalDate date, Patient patient, String medicine, Doctor doctor) {
        this.date = date;
        this.pacientName = patient.getName();
        this.medicine = medicine;
        this.doctorName = doctor.getName();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPacientName() {
        return pacientName;
    }

    public void setPacientName(String pacientName) {
        this.pacientName = pacientName;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "date=" + date +
                ", pacientName='" + pacientName + '\'' +
                ", drug='" + medicine + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
