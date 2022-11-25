package hospital;

public class Nurse extends Employee{
    public Nurse(String name, int age, String sex, int id) {
        super(name, age, sex, id);
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm a nurse.");
    }

}
