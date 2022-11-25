package hospital;

public class Receptionist extends Employee{

    public Receptionist(String name, int age, String sex, int id) {
        super(name, age, sex, id);
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm a receptionist.");
    }

    public void registerPatient(Hospital hospital,Patient patient){
        hospital.addPatient(patient);
    }

    public void patientStatus(Patient patient){
        System.out.println(patient.toString());
    }
}
