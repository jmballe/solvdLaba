package hospital;

public abstract class Employee extends Person{
    private int id;

    public Employee(){}

    public Employee(String name, int age, String sex, int id) {
        super(name, age, sex);
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
