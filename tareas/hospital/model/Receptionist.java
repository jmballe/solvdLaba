package hospital.model;

import hospital.exceptions.InvalidAgeException;
import hospital.exceptions.InvalidGenderException;
import hospital.exceptions.InvalidIdException;
import hospital.interfaces.Introducible;

import java.time.LocalTime;

public class Receptionist extends Employee implements Introducible {

    public Receptionist(String name, int age, String sex, String id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate)
            throws InvalidAgeException, InvalidGenderException {
        super(name, age, sex, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        System.out.println("Hi! My name is " + getName() + ". I'm a receptionist.");
    }

    public void registerPatient(Hospital hospital,Patient patient) throws InvalidIdException {
        hospital.addPatient(patient);
    }

    public void patientStatus(Patient patient){
        System.out.println(patient.getStatus());
    }


}
