package hospital.model;

import hospital.exceptions.InvalidAgeException;
import hospital.exceptions.InvalidGenderException;
import hospital.interfaces.Diagnosable;
import hospital.interfaces.Introducible;

import java.time.LocalTime;

public final class Nurse extends Employee implements Diagnosable, Introducible {
    public Nurse(String name, int age, String sex, String id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate)
            throws InvalidAgeException, InvalidGenderException {
        super(name, age, sex, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm a nurse.");
    }

    @Override
    public void checkPatient() {

    }
}
