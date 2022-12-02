package hospital.model;

import java.time.LocalTime;

public class Receptionist extends Employee{

    public Receptionist(String name, int age, String sex, int id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate) {
        super(name, age, sex, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm a receptionist.");
    }

    public void registerPatient(Hospital hospital,Patient patient){
        hospital.addPatient(patient);
    }

    public void patientStatus(Patient patient){
        System.out.println(patient.toString());
    }
}
