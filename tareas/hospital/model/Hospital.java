package hospital.model;

import java.util.Objects;
import java.util.List;

public class Hospital {
    private String adress;
    private List<Room> rooms;
    private List<Doctor> doctors;
    private List<Deparment> deparments;
    private List<Patient> patients;

    public Hospital(){}

    public Hospital(String adress, List<Room> rooms, List<Doctor> doctors, List<Deparment> deparments, List<Patient> patients) {
        this.adress = adress;
        this.rooms = rooms;
        this.doctors = doctors;
        this.deparments = deparments;
        this.patients = patients;
    }

    public String getAdress() {
        return adress;
    }

    public void ListAdress(String adress) {
        this.adress = adress;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void ListRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void ListDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Deparment> getDeparments() {
        return deparments;
    }

    public void ListDeparments(List<Deparment> deparments) {
        this.deparments = deparments;
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(adress, hospital.adress) && Objects.equals(rooms, hospital.rooms) && Objects.equals(doctors, hospital.doctors) && Objects.equals(deparments, hospital.deparments) && Objects.equals(patients, hospital.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adress, rooms, doctors, deparments, patients);
    }
}
