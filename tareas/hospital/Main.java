package hospital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Doctors

        String doc1Name = "John Smith";
        int doc1Age = 33;
        String doc1Sex = "male";
        String doc1Specialization = "Traumatologist";
        int doc1id= 1;

        String doc2Name = "Jack Sparrow";
        int doc2Age = 44;
        String doc2Sex = "male";
        String doc2Specialization = "Surgeon";
        int doc2id= 2;

        Doctor doctor1 = new Doctor(doc1Name,doc1Age,doc1Sex,doc1id,doc1Specialization);
        Doctor doctor2 = new Doctor(doc2Name,doc2Age,doc2Sex,doc2id,doc2Specialization);
        Doctor doctor3 = new Doctor();

        doctor3.setName("Laura Ibarra");
        doctor3.setAge(50);
        doctor3.setId(3);
        doctor3.setSex("female");
        doctor3.setSpecialization("Cardiologist");
        List<Doctor> doctors = new ArrayList<>();

        doctors.add(doctor1);
        doctors.add(doctor2);

        Hospital hospital = new Hospital();

        hospital.ListDoctors(doctors);
        hospital.addDoctor(doctor3);

        System.out.println(hospital.getDoctors());




    }
}
