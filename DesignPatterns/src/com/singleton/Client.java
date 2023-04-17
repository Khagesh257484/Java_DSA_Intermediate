package com.singleton;

public class Client {
    public static void main(String[] args) {

           /* can't create object of class cause constructor is private so to create call getInstance method.
        Student s1= new Student();
        Student s2= new Student();
        System.out.println(s1.equals(s2));
        */

        Student st= Student.getInstance();
        Student st1=Student.getInstance();
        System.out.println(st.equals(st1));

    }
}
