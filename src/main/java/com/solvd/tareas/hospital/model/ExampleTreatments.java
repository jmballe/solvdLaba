package com.solvd.tareas.hospital.model;

import java.time.LocalDateTime;

public enum ExampleTreatments {
    TREATMENT1("Heart Surgery",5000.0, LocalDateTime.parse("2022-12-10T09:59:59")),
    TREATMENT2("Xrays",300.0,LocalDateTime.parse("2022-11-31T09:59:59")),
    TREATMENT3("Endoscopy",1500.0,LocalDateTime.parse("2022-10-31T08:59:59")),
    TREATMENT4("Appendectomy",2000.0,LocalDateTime.parse("2022-11-25T15:00:00")),
    ;

    private final String name;
    private final double cost;
    private final LocalDateTime treatmentTime;

    ExampleTreatments(String name, double cost, LocalDateTime treatmentTime) {
        this.name = name;
        this.cost = cost;
        this.treatmentTime = treatmentTime;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public LocalDateTime getTreatmentTime() {
        return treatmentTime;
    }
}
