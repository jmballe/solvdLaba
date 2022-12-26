package com.solvd.tareas.hospital.model;

public enum ExampleDepartments {
    RECEPTION_1A("1-a",Speciality.RECEPTION),
    SURGERY_2A("2-a",Speciality.SURGERY),
    INTENSIVE_CARE_2C("2-c",Speciality.INTENSIVE_CARE),
    PEDIATRICS_3A("3-a",Speciality.PEDIATRICS),
    TRAUMATOLOGY_3B("3-b",Speciality.TRAUMATOLOGY),
    CARDIOLOGY_3B("3-b",Speciality.CARDIOLOGY),
    GASTROENTEROLOGY_3C("2-b",Speciality.GASTROENTEROLOGY),
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
