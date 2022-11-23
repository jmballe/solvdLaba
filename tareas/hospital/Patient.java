package hospital;

import java.util.Objects;

public class Patient extends Person{
    private int id;
    private int roomid;
    private String address;
    private String status;
    private String phoneNumber;

    public Patient(String Name, int age, String sex, int id,
                   int roomid, String address, String phoneNumber) {
        super(Name, age, sex);
        this.id = id;
        this.roomid = roomid;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Patient{" +
                "name=" + getName() +
                "Adress=" + getAddress() +
                "Age=" + getAge() +
                "Sex=" + getSex() +
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
