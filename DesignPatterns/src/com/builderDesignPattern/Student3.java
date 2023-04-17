package com.builderDesignPattern;

public class Student3 {
    private String firstName, lastName, university;
    private int age;
    private double psp, weight;

    public Student3(Helper helper) {
        this.firstName = helper.firstName;
        this.lastName = helper.lastName;
        this.age = helper.age;
    }


    // If any method is needed with some required parameters then we can use it
    // can't create constructor cause signature is same for constructor and jvm will not allow.
    public void studentWithUniversity(Helper helper) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = helper.age;
        this.university = helper.university;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniversity() {
        return university;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public double getWeight() {
        return weight;
    }
}
