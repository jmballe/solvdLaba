package hospital.model;

import hospital.exceptions.InvalidIdException;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Hospital {
    private String adress;
    private List<Room> rooms;
    private List<Doctor> doctors;
    private List<Deparment> deparments;
    private List<Patient> patients;

    private List<String> ids;

    public Hospital(){
        rooms = new ArrayList<Room>();
        patients = new ArrayList<Patient>();
        doctors = new ArrayList<Doctor>();
        ids = new ArrayList<String>();
        deparments = new ArrayList<Deparment>();
    }

    public Hospital(String adress, List<Room> rooms, List<Doctor> doctors, List<Deparment> deparments, List<Patient> patients, List<String> ids) {
        this.adress = adress;
        this.rooms = rooms;
        this.doctors = doctors;
        this.deparments = deparments;
        this.patients = patients;
        this.ids = ids;
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

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) throws InvalidIdException {
        for (Doctor doctor: doctors) {
            addDoctor(doctor);
        }
    }

    public List<Deparment> getDeparments() {
        return deparments;
    }

    public void setDeparments(List<Deparment> deparments) {
        this.deparments = deparments;
    }

    public void addDoctor(Doctor doctor) throws InvalidIdException {
        if(checkIdAlreadyAdded(ids,doctor.getUniqueID()))
            throw new InvalidIdException("ID already in use.");
        ids.add(doctor.getUniqueID());
        doctors.add(doctor);

    }

    public void addPatient(Patient patient) throws InvalidIdException{
        if(checkIdAlreadyAdded(ids,patient.getUniqueID()))
            throw new InvalidIdException("ID already in use.");
        ids.add(patient.getUniqueID());
        patients.add(patient);
    }

    private boolean checkIdAlreadyAdded(List<String> ids, String personId){
        if(ids.isEmpty()){
            return false;
        } else {
            return ids.contains(personId);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(adress, hospital.adress) && Objects.equals(rooms, hospital.rooms) &&
                Objects.equals(doctors, hospital.doctors) && Objects.equals(deparments, hospital.deparments) &&
                Objects.equals(patients, hospital.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adress, rooms, doctors, deparments, patients);
    }
}
