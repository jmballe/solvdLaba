package com.solvd.tareas.hospital.exampleValues;

import com.solvd.tareas.hospital.model.PatientStatus;
import com.solvd.tareas.hospital.model.Speciality;

public enum ExamplePatients {

    PATIENT1("Lucas Smith",25, "male", "33581170",
            PatientStatus.BAD_LOW_SEVERITY, Speciality.CARDIOLOGY),

    PATIENT2("Jason Dall",45, "male", "10181213",
            PatientStatus.GOOD, Speciality.DERMATOLOGY),

    PATIENT3("Laura Summer",55, "female", "39341594",
            PatientStatus.BAD_MID_SEVERITY, Speciality.INTENSIVE_CARE),

    PATIENT4("Eric Bradwin",78, "male", "09184353",
            PatientStatus.BAD_HIGH_SEVERITY, Speciality.SURGERY),

    PATIENT5("Mike Wasawski",34, "male",  "14981432",
            PatientStatus.BAD_LOW_SEVERITY, Speciality.TRAUMATOLOGY),

    PATIENT6("Laura Walmart",24, "female", "12312654",
            PatientStatus.NORMAL, Speciality.DERMATOLOGY),
            ;

    final private String name;
    final private int age;
    final private String gender;
    final private String ID;
    final private PatientStatus status;
    final private Speciality beingTreatedIn;


    ExamplePatients(String name, int age, String gender, String ID, PatientStatus status, Speciality beingTreatedIn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.status = status;
        this.beingTreatedIn = beingTreatedIn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getID() {
        return ID;
    }

    public PatientStatus getStatus() {
        return status;
    }

    public Speciality getBeingTreatedIn() {
        return beingTreatedIn;
    }
}