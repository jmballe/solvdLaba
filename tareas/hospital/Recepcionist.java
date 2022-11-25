package hospital;

public class Recepcionist extends Employee{

    public Recepcionist(String name, int age, String sex, int id) {
        super(name, age, sex, id);
    }

    public void registerPatient(Hospital hospital,Patient patient){
        hospital.addPatient(patient);
    }

    public void patientStatus(Patient patient){
        System.out.println(patient.toString());
    }
}
