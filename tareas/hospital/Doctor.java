package hospital;

import java.time.LocalTime;
import java.util.Objects;

public class Doctor extends Employee{

    private Speciality specialization;

    public Doctor() {}

    @Override
    public void introduce() {
        System.out.println("Hi! i'm a doctor.");
    }

    public Doctor(String name, int age, String gender, int id, LocalTime entryHour ,LocalTime leaveHour , double hourlyPayRate , Speciality specialization) {
        super(name, age, gender, id, entryHour, leaveHour, hourlyPayRate);
        this.specialization = specialization;
    }

    public Speciality getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Speciality specialization) {
        this.specialization = specialization;
    }


    private void givePrescription(Patient patient, Prescription prescription){

    }

    private void giveTest(Patient patient, Test test){

    }

    @Override
    public String toString() {
        return "You will be treated by doctor: " + this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(specialization, doctor.specialization) &&
                getName().equals(doctor.getName())
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialization,getName());
    }
}
