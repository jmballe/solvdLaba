package com.solvd.tareas.hospital.interfaces;

import com.solvd.tareas.hospital.model.Doctor;

import java.time.LocalDateTime;

public interface Schedulable {
    void scheduleAppointment(LocalDateTime appointment, Doctor doctor);
}
