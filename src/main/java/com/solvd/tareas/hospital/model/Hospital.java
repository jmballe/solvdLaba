package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidIdException;

import java.util.*;

public class Hospital {
    private String address;

    private String phoneNumber;
    private Set<Doctor> doctors;
    private List<Department> departments;
    private Set<Patient> patients;
    private Set<String> ids;

    public Hospital(){
        patients = new HashSet<>();
        doctors = new HashSet<>();
        ids = new HashSet<>();
        departments = new ArrayList<Department>();
    }

    public Hospital(String address, String phoneNumber, Set<Doctor> doctors, List<Department> departments, Set<Patient> patients, Set<String> ids) {
        this.address = address;
        this.doctors = doctors;
        this.departments = departments;
        this.patients = patients;
        this.ids = ids;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) throws InvalidIdException {
        for (Doctor doctor: doctors) {
            addDoctor(doctor);
        }
    }

    public List<Department> getDeparments() {
        return departments;
    }

    public void addDepartments(Department dept){
        departments.add(dept);
    }

    public void addDoctor(Doctor doctor) throws InvalidIdException {
        if(checkIdAlreadyAdded(ids,doctor.getUniqueID()))
            throw new InvalidIdException("ID already in use.");
        ids.add(doctor.getUniqueID());
        doctors.add(doctor);

    }

    public void addPatient(Patient patient) throws InvalidIdException {
        if(checkIdAlreadyAdded(ids,patient.getUniqueID()))
            throw new InvalidIdException("ID already in use.");
        ids.add(patient.getUniqueID());
        patients.add(patient);
    }

    public boolean checkIdAlreadyAdded(Set<String> ids, String personId){
        if(ids.isEmpty()){
            return false;
        } else {
            return ids.contains(personId);
        }
    }
}
