package hospital;

import java.util.Date;

public class Prescription {
    private Date date;
    private String pacientName;
    private String medicine;
    private String doctorName;

    public Prescription(Date date, String pacientName, String medicine, String doctorName) {
        this.date = date;
        this.pacientName = pacientName;
        this.medicine = medicine;
        this.doctorName = doctorName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPacientName() {
        return pacientName;
    }

    public void setPacientName(String pacientName) {
        this.pacientName = pacientName;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "date=" + date +
                ", pacientName='" + pacientName + '\'' +
                ", drug='" + medicine + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
