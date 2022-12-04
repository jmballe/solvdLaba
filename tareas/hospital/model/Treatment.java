package hospital.model;

import java.time.LocalDateTime;

public class Treatment {
    private String name;
    private double cost;

    private Patient patient;

    private Doctor doctor;
    private boolean payed;

    private LocalDateTime localDateTime;

    public Treatment(String name, double cost, Patient patient, Doctor doctor, boolean payed, LocalDateTime localDateTime) {
        this.name = name;
        this.cost = cost;
        this.patient = patient;
        this.doctor = doctor;
        this.payed = payed;
        this.localDateTime = localDateTime;
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
