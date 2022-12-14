package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidIdException;
import com.solvd.tareas.hospital.exceptions.InvalidPaymentException;

import java.util.*;
import java.util.stream.Collectors;

public class Hospital {
    private String address;
    private String phoneNumber;
    private List<Department> departments;
    private Reception reception;
    private Set<String> ids;
    private Double reserve;

    public Hospital(){
        ids = new HashSet<>();
        departments = new ArrayList<>();
        reception = new Reception();
        reserve = 1000000.0;
    }

    public Hospital(String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        ids = new HashSet<>();
        departments = new ArrayList<>();
        reception = new Reception();
        reserve = 1000000.0;
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

    public List<Department> getDeparments() {
        return departments;
    }

    public void addDepartments(Department dept){
        departments.add(dept);
    }

    public Reception getReception() {
        return reception;
    }

    public Set<String> getIds() {
        return ids;
    }

    public Double getReserve() {
        return reserve;
    }

    public void setReserve(Double reserve) {
        this.reserve = reserve;
    }

    public void getPay(Double money) throws InvalidPaymentException {
        if(money < 0){
            throw new InvalidPaymentException("Payment must be positive");
        }
        this.reserve += money;
    }

    public void addID(String id) throws InvalidIdException {
        if(ids.contains(id)){
            throw new InvalidIdException("ID already in use.");}
        ids.add(id);
    }

    public Map<String, Employee> allEmployees(){
        Map<String,Employee> allEmployees = new HashMap<>();
        for(Department dept : departments){
            dept.getDeptDoctors().forEach(doctor -> allEmployees.put(doctor.getUniqueID(),doctor));
            dept.getDeptNurses().forEach(nurse-> allEmployees.put(nurse.getUniqueID(),nurse));
        }
        reception.getReceptionists().forEach(r->allEmployees.put(r.getUniqueID(),r));

        return allEmployees;
    }

    public Map<String, Patient> getAllPatients(){
        Map<String,Patient> allPatients = new HashMap<>();
        departments.forEach(dept -> dept.getDeptPatients().forEach(patient-> allPatients.put(patient.getUniqueID(),patient)));
        return allPatients;
    }

    public Patient searchPatientById(String id){
        return getAllPatients().get(id);
    }

    public List<Patient> searchPatientByName(String name){
       return getAllPatients().values().stream().filter(s-> s.getName().equals(name)).collect(Collectors.toList());
    }

    public Doctor searchDoctorById(String id){
        return (Doctor) allEmployees().values().stream().filter(e -> e instanceof Doctor).findFirst().orElseGet(null);
    }

}
