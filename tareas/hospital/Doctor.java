package hospital;

import java.util.Objects;

public class Doctor extends Employee{

    private String specialization;

    public Doctor() {}

    public Doctor(String name, int age, String sex, int id, String specialization) {
        super(name, age, sex, id);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
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
