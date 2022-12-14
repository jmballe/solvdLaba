package hospital.interfaces;

import hospital.model.Doctor;

import java.time.LocalDateTime;

public interface Schedulable {
    void scheduleAppointment(LocalDateTime appointment, Doctor doctor);
}
