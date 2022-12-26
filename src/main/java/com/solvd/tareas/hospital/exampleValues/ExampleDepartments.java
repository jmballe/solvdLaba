package com.solvd.tareas.hospital.exampleValues;

import com.solvd.tareas.hospital.model.Speciality;

public enum ExampleDepartments {
    RECEPTION_1A("1-a", Speciality.RECEPTION),
    SURGERY_2A("2-a",Speciality.SURGERY),
    INTENSIVE_CARE_2B("2-b",Speciality.INTENSIVE_CARE),
    PEDIATRICS_3A("3-a",Speciality.PEDIATRICS),
    TRAUMATOLOGY_3B("3-b",Speciality.TRAUMATOLOGY),
    CARDIOLOGY_3B("3-b",Speciality.CARDIOLOGY),
    GASTROENTEROLOGY_3C("3-c",Speciality.GASTROENTEROLOGY),
    DERMATOLOGY_3C("3-c",Speciality.DERMATOLOGY),
    ;
    private final String location;
    private final Speciality speciality;

    ExampleDepartments(String location, Speciality speciality) {
        this.location = location;
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public String getLocation() {
        return location;
    }
}
