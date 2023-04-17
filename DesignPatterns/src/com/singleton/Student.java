package com.singleton;

public class Student {
    String name;  // private can access with in same class so there is no problem in same class, but can't call in another class, for that need any public method
    int age;
    static Student st;  // Can we call private variable by declaring static, no This also does not help to access private variable outside the class.


    private Student() {  // If we declare a constructor as public,then we can create the object of class. Declaring as private it restricts to create the object of class from any class.
        System.out.println("Default Student Constructor");
    }

    // Private constructor also can't call from the outside the Class.
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter Setters to access the private variable from outside the class (Customize getter Setter)
    public void setStudentName(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.name;
    }


    // as constructor declared as private, so to create the object of the class, one public method need to be create.
    public static  Student getInstance() {
        if (st == null)
            st = new Student();

        return st;
    }

}
