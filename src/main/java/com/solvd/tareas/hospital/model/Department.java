package com.solvd.tareas.hospital.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Room room;
    private Speciality speciality;
    private List<Doctor> deptDoctors;

    public Department(){
        deptDoctors = new ArrayList<Doctor>();
    }
    public Department(Room room, Speciality speciality, List<Doctor> deptDoctors) {
        this.room = room;
        this.speciality = speciality;
        this.deptDoctors = deptDoctors;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public List<Doctor> getDeptDoctors() {
        return deptDoctors;
    }

    public void setDeptDoctors(List<Doctor> deptDoctors) {
        this.deptDoctors = deptDoctors;
    }
}
