package hospital.model;

import java.time.LocalTime;

public class Nurse extends Employee{
    public Nurse(String name, int age, String sex, int id, LocalTime entryHour , LocalTime leaveHour , double hourlyPayRate) {
        super(name, age, sex, id,entryHour,leaveHour,hourlyPayRate);
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm a nurse.");
    }

}
