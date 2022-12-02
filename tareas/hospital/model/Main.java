package hospital.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Doctors
        LocalTime entranceTime = LocalTime.of(8, 0);
        LocalTime leaveTime = LocalTime.of(16, 30);
        String doc1Name = "John Smith";
        int doc1Age = 33;
        String doc1Sex = "male";
        Speciality doc1Specialization = Speciality.TRAUMATOLOGY;
        int doc1id= 1;
        double doc1PayRate = 50.00;


        String doc2Name = "Jack Sparrow";
        int doc2Age = 44;
        String doc2Sex = "male";
        Speciality doc2Specialization = Speciality.CARDIOLOGY;
        int doc2id= 2;
        double doc2PayRate = 40.00;

        Doctor doctor1 = new Doctor(doc1Name,doc1Age,doc1Sex,doc1id, entranceTime,
                leaveTime,doc1PayRate,doc1Specialization);
        Doctor doctor2 = new Doctor(doc2Name,doc2Age,doc2Sex,doc2id, entranceTime,
                leaveTime,doc2PayRate,doc2Specialization);
        Doctor doctor3 = new Doctor();

        doctor3.setName("Laura Ibarra");
        doctor3.setAge(50);
        doctor3.setId(3);
        doctor3.setGender("female");
        doctor3.setSpecialization(Speciality.DERMATOLOGY);
        List<Doctor> doctors = new ArrayList<>();

        doctors.add(doctor1);
        doctors.add(doctor2);

        Hospital hospital = new Hospital();

        hospital.ListDoctors(doctors);
        hospital.addDoctor(doctor3);

        System.out.println(hospital.getDoctors());

    }
}
