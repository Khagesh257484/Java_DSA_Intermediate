package com.builderDesignPattern;

public class Student {
    private String firstName, lastName, university;
    private int age;
    private double weight, psp;


    public Student(){

    }
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int age) {
        this(firstName, lastName);
        //this.firstName=firstName;
        //this.lastName=lastName;
        // duplicate code of above constructor, if we have multiple constructor like that then we can have more duplicate, violates DRY principle
        // So use this(attr 1, attr 2...)
        this.age = age;
    }

 /*   public Student(String firstName, String lastName, String university, int age, double weight, double psp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
        this.age = age;
        this.weight = weight;
        this.psp = psp;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", psp=" + psp +
                '}';
    }
}
