package com.builderDesignPattern;

import java.util.Map;

public class Student2 {
   private String firstName, lastName;
   private int age;


    public Student2() {
    }

    public Student2(Map<String, Object> map) {
        this.firstName = (String) map.get("firstName");
        this.lastName = (String) map.get("lastName");
        this.age = (int) map.get("age");
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
