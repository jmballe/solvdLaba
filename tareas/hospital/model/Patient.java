package hospital.model;

import hospital.exceptions.InvalidAgeException;
import hospital.exceptions.InvalidGenderException;
import hospital.interfaces.Introducible;

import java.util.Objects;

public class Patient extends Person implements Introducible {
    private int id;
    private int roomid;
    private String address;
    private String status;
    private String phoneNumber;
    private Prescription prescription;
    private double owedMoney;

    public Patient(String Name, int age, String sex, String id,
                   int roomId, String address, String phoneNumber) throws InvalidAgeException, InvalidGenderException {
        super(Name, age, sex, id);
        this.roomid = roomId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.owedMoney = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm a patient. My name is " + getName() + ".");
    }


    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getOwedMoney() {
        return owedMoney;
    }

    public void hospitalCharges(double chargedAmount){
        owedMoney += chargedAmount;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name=" + getName() +
                "Adress=" + getAddress() +
                "Age=" + getAge() +
                "Sex=" + getGender() +
                "id=" + id +
                ", roomid=" + roomid +
                ", adress='" + address + '\'' +
                ", status='" + status + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && roomid == patient.roomid &&
                Objects.equals(address, patient.address) && Objects.equals(phoneNumber, patient.phoneNumber)
                && getName().equals(patient.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomid, address, phoneNumber,this.getName());
    }
}
