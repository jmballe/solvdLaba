package com.solvd.tareas.hospital.exampleValues;

import com.solvd.tareas.hospital.model.Speciality;

import java.time.LocalTime;

public enum ExampleEmployees {

    DOC1( "Michael Smith",40, "male", "doctor", "26581590",
            40.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0),  Speciality.SURGERY),
    DOC2("David Brown",66, "male",  "doctor", "10225739",
            75.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0), Speciality.DERMATOLOGY),
    DOC3("Emily Jones", 52, "female", "doctor", "19226739",
            75.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0), Speciality.TRAUMATOLOGY),
    DOC4("Sarah Williams",45, "female",  "doctor", "24647160",
            50.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0), Speciality.CARDIOLOGY),
    DOC5("Laura Williams",42, "female",  "doctor", "25647180",
            50.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0), Speciality.INTENSIVE_CARE),
    NURSE1("Matthew Thompson",46, "male",  "nurse", "23607187",
            30.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0), Speciality.INTENSIVE_CARE),
    NURSE2("Rachel Martin",38, "female",  "nurse", "30581569",
            28.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0), Speciality.SURGERY),
    RECEPTIONIST1("James Anderson",30, "male",  "receptionist", "35581570",
            22.0,  LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0),Speciality.RECEPTION),
    RECEPTIONIST2("Jennifer Thompson",28, "female",  "receptionist", "37581580",
            22.0, LocalTime.of(8, 0),
            LocalTime.of(17, 0, 0),Speciality.RECEPTION),
    ;
    private final String fullName;
    private final int age;
    private final String gender;
    private final String profession;
    private final String ID;
    private final double payRate;
    private final LocalTime entryTime;
    private final LocalTime leavingTime;
    private final Speciality speciality;

    ExampleEmployees(String fullName,int age, String gender, String profession, String ID,
                     double payRate, LocalTime entryTime, LocalTime leavingTime,
                     Speciality speciality) {
        this.age = age;
        this.gender = gender;
        this.fullName = fullName;
        this.profession = profession;
        this.ID = ID;
        this.payRate = payRate;
        this.entryTime = entryTime;
        this.leavingTime = leavingTime;
        this.speciality = speciality;
    }

    //Getters
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getFullName() {
        return fullName;
    }

    public String getProfession() {
        return profession;
    }

    public String getID() {
        return ID;
    }

    public double getPayRate() {
        return payRate;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public LocalTime getLeavingTime() {
        return leavingTime;
    }

    public Speciality getSpeciality() {
        return speciality;
    }
}
