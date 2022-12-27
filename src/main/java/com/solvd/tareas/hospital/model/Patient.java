package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidPaymentException;
import com.solvd.tareas.hospital.interfaces.Chargeable;
import com.solvd.tareas.hospital.interfaces.Introducible;
import com.solvd.tareas.hospital.interfaces.Schedulable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.*;

public class Patient extends Person implements Introducible, Schedulable, Chargeable {
    private static final Logger log = LogManager.getLogger(Patient.class);
    private PatientStatus status;
    private Speciality beingTreatedIn;
    private List<Prescription> prescriptions;
    private double owedMoney;
    private Map<LocalDateTime, Doctor> appointments;
    private List<Treatment> treatments;

    public Patient(String name, int age, String gender, String id,
                   PatientStatus status , Speciality beingTreatedIn) throws InvalidAgeException, InvalidGenderException {
        super(name, age, gender, id);
        this.status = status;
        this.beingTreatedIn = beingTreatedIn;
        this.owedMoney = 0;
        appointments  = new HashMap<LocalDateTime, Doctor>();
        treatments = new ArrayList<>();
    }

    public PatientStatus getStatus() {
        return status;
    }

    public void setStatus(PatientStatus status) {
        this.status = status;
    }

    public Speciality getBeingTreatedIn() {
        return beingTreatedIn;
    }

    public void setBeingTreatedIn(Speciality beingTreatedIn) {
        this.beingTreatedIn = beingTreatedIn;
    }

    public double getOwedMoney() {
        return owedMoney;
    }

    public void hospitalCharges(double chargedAmount){
        this.owedMoney += chargedAmount;
    }

    public Map<LocalDateTime, Doctor> getAppointments() {
        return appointments;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void addTreatment(Treatment treatment){
        treatments.add(treatment);
        hospitalCharges(treatment.getCost());
    }

    public List<Prescription> getPrescriptions(){
        return prescriptions;
    }

    public void addPrescription(Prescription prescription){
        prescriptions.add(prescription);
    }

    @Override
    public void introduce() {
        log.info("Hi! i'm a patient. My name is " + getName() + ".");
    }

    public void payCharges(Hospital hospital) throws InvalidPaymentException {
        hospital.getPay(owedMoney);
        treatments.forEach(treatment -> treatment.setPayed(true));
        log.info( getName() + " have payed " + owedMoney);
        owedMoney = 0;
    }

    @Override
    public void scheduleAppointment(LocalDateTime appointmentTime, Doctor doctor) {
        appointments.put(appointmentTime,doctor);
    }

    @Override
    public void getCharges() {
        log.info("You own " + owedMoney);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name=" + getName() +
                "Age=" + getAge() +
                "Sex=" + getGender() +
                "id=" + getUniqueID() +
                ", status='" + status + '\'' +
                ", beingTreatedIn='" + beingTreatedIn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(getUniqueID(), patient.getUniqueID()) &&
                getName().equals(patient.getName());
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
