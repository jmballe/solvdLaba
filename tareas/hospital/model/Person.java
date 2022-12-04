package hospital.model;

import hospital.exceptions.InvalidAgeException;
import hospital.exceptions.InvalidGenderException;

public abstract class Person {
    private String name;
    private int age;
    private String gender;

    private String uniqueID;

    public Person(){

    }

    public Person(String name, int age, String gender, String uniqueID) throws InvalidAgeException, InvalidGenderException {
        this.name = name;
        if(age < 0){
            throw new InvalidAgeException("Age must be grater than 0.");
        }

        this.age = age;
        if(!(gender.equals("male") || gender.equals("female"))){
            throw new InvalidGenderException("Gender must be female or male.");
        }

        this.gender=gender;

        this.uniqueID = uniqueID;
    }

//    public abstract void introduce();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getUniqueID(){
        return uniqueID;
    }
}
