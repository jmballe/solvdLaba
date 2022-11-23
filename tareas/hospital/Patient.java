package hospital;

import java.util.Objects;

public class Patient extends Person{
    private int id;
    private int roomid;
    private String adress;

    private String status;
    private String phoneNumber;

    public Patient(String Name, int age, String sex, int id,
                   int roomid, String adress, String phoneNumber) {
        super(Name, age, sex);
        this.id = id;
        this.roomid = roomid;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
                "Adress=" + getAdress() +
                "Age=" + getAge() +
                "Sex=" + getSex() +
                "id=" + id +
                ", roomid=" + roomid +
                ", adress='" + adress + '\'' +
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
                Objects.equals(adress, patient.adress) && Objects.equals(phoneNumber, patient.phoneNumber)
                && getName().equals(patient.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomid, adress, phoneNumber,this.getName());
    }
}
