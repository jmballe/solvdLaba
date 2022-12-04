package hospital.model;

import hospital.exceptions.InvalidAgeException;
import hospital.exceptions.InvalidGenderException;
import hospital.interfaces.Diagnosable;
import hospital.interfaces.Introducible;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Doctor extends Employee implements Diagnosable, Introducible {

    private Speciality specialization;

    private List<Treatment> treatments = new ArrayList<Treatment>();

    public Doctor() {}

    @Override
    public void introduce() {
        System.out.println("Hi! I'm doctor " + getName() + ".");
    }

    public Doctor(String name, int age, String gender, String id, LocalTime entryHour ,LocalTime leaveHour , double hourlyPayRate , Speciality specialization)
            throws InvalidAgeException, InvalidGenderException {
        super(name, age, gender, id, entryHour, leaveHour, hourlyPayRate);
        this.specialization = specialization;
    }

    public Speciality getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Speciality specialization) {
        this.specialization = specialization;
    }

    public void addTreatment(Treatment treatment){
        treatments.add(treatment);
    }

    private void givePrescription(Patient patient, Prescription prescription){

    }

    private void giveTest(Patient patient, Test test){

    }

    @Override
    public void checkPatient() {

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
