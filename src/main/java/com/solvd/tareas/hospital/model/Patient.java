package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.interfaces.Chargeable;
import com.solvd.tareas.hospital.interfaces.Introducible;
import com.solvd.tareas.hospital.interfaces.Schedulable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.*;

public class Patient extends Person implements Introducible, Schedulable, Chargeable {
    private static final Logger log = LogManager.getLogger(Patient.class);
    private int roomid;
    private String address;
    private String status;
    private String phoneNumber;
    private Prescription prescription;
    private double owedMoney;
    private Map<LocalDateTime, Doctor> appointments = new HashMap<LocalDateTime, Doctor>();

    private List<Treatment> treatments = new ArrayList<Treatment>();

    public Patient(String Name, int age, String sex, String id,
                   int roomId, String address, String phoneNumber) throws InvalidAgeException, InvalidGenderException {
        super(Name, age, sex, id);
        this.roomid = roomId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.owedMoney = 0;
    }

    @Override
    public void introduce() {
        log.info("Hi! i'm a patient. My name is " + getName() + ".");
    }


    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getOwedMoney() {
        return owedMoney;
    }

    public void hospitalCharges(double chargedAmount){
        owedMoney += chargedAmount;
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

    public void payCharges(){
        treatments.forEach(treatment -> treatment.setPayed(true));
        owedMoney = 0;
    }

    @Override
    public void scheduleAppointment(LocalDateTime appointmentTime, Doctor doctor) {
        appointments.put(appointmentTime,doctor);
    }

    @Override
    public void getCharges() {
        log.info("You own" + owedMoney);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name=" + getName() +
                "Adress=" + getAddress() +
                "Age=" + getAge() +
                "Sex=" + getGender() +
                "id=" + getUniqueID() +
                ", roomid=" + roomid +
                ", adress='" + address + '\'' +
                ", status='" + status + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return getUniqueID() == patient.getUniqueID() &&
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
