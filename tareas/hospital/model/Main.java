package hospital.model;

import hospital.exceptions.InvalidAgeException;
import hospital.exceptions.InvalidGenderException;
import hospital.exceptions.InvalidIdException;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidIdException, InvalidAgeException, InvalidGenderException {

        //Doctors
        LocalTime entranceTime = LocalTime.of(8, 0);
        LocalTime leaveTime = LocalTime.of(16, 30);
        String doc1Name = "John Smith";
        int doc1Age = 33;
        String doc1Sex = "male";
        Speciality doc1Specialization = Speciality.TRAUMATOLOGY;
        String doc1id= "456789123";
        double doc1PayRate = 50.00;


        String doc2Name = "Jack Sparrow";
        int doc2Age = 44;
        String doc2Sex = "male";
        Speciality doc2Specialization = Speciality.CARDIOLOGY;
        String doc2id= "654789123";
        double doc2PayRate = 40.00;

        Doctor doctor1 = new Doctor(doc1Name,doc1Age,doc1Sex,doc1id, entranceTime,
                leaveTime,doc1PayRate,doc1Specialization);
        Doctor doctor2 = new Doctor(doc2Name,doc2Age,doc2Sex,doc2id, entranceTime,
                leaveTime,doc2PayRate,doc2Specialization);
        Doctor doctor3 = new Doctor();

        doctor3.setName("Laura Ibarra");
        doctor3.setAge(50);
        doctor3.setUniqueID("123456879");
        doctor3.setGender("female");
        doctor3.setSpecialization(Speciality.DERMATOLOGY);
        List<Doctor> doctors = new ArrayList<>();

        doctors.add(doctor1);
        doctors.add(doctor2);

        Hospital hospital = new Hospital();

        hospital.setDoctors(doctors);
        hospital.addDoctor(doctor3);

        System.out.println(hospital.getDoctors());

    }
}
