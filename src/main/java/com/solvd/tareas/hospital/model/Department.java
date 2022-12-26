package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Department {
    private String location;
    private Speciality speciality;
    private Set<Doctor> deptDoctors;
    private Set<Patient> deptPatients;
    private Set<Nurse> deptNurses;

    public Department(String location, Speciality speciality) {
        this.location = location;
        this.speciality = speciality;
        deptDoctors = new HashSet<>();
        deptNurses = new HashSet<>();
        deptPatients = new HashSet<>();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Set<Doctor> getDeptDoctors() {
        return deptDoctors;
    }

    public Set<Patient> getDeptPatients() {
        return deptPatients;
    }
    public Set<Nurse> getDeptNurses() {
        return deptNurses;
    }

    public void addPatientDept(Patient patient){
        deptPatients.add(patient);

    }

    public void addEmployee( String name, int age, String gender, String profession, String ID,LocalTime entryTime,
                                 LocalTime leavingTime,
                             double payRate, Speciality speciality) throws InvalidAgeException, InvalidPayRateException, InvalidGenderException {
        switch (profession) {
            case "doctor" -> {
                Doctor doctor = new Doctor(name,age,gender,ID,entryTime,leavingTime,payRate,speciality);
                deptDoctors.add(doctor);
            }
            case "nurse" -> {
                Nurse nurse = new Nurse(name, age, gender,ID, entryTime,leavingTime,payRate);
                deptNurses.add(nurse);
            }
            default -> {
            }
        }
    }
}
