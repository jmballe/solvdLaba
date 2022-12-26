package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;

public abstract class Person {
    private String name;
    private Integer age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", uniqueID='" + uniqueID + '\'' +
                '}';
    }
}
