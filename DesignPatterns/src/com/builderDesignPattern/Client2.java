package com.builderDesignPattern;

import java.util.HashMap;
import java.util.Map;

/*
 In Class client 1, still we're ending up with multiple constructor with required attributes. So how can we solve this
 for this we need a data structure which can provide facility to store the attribute value with respect attribute name

 Map is a data structure which can do this, it has key value pair
* */
public class Client2 {
    public static void main(String[] args) {
        Student2 st1 = new Student2();
        // can't we do that using this class without getter and setter,or it is violating any rule or not good code practice

        Map<String, Object> studentMap = new HashMap<String, Object>();
        // Also can set using setter but there is problem, need to be typecast at every attribute
       // st1.setFirstName((String) studentMap.put("firstName", "Khagesh"));
        studentMap.put("firstName", "Khagesh");
        studentMap.put("LastName", "Sharma");
        studentMap.put("age", 32);

        Student2 st = new Student2(studentMap);
        //System.out.println(st.firstName + " : " + st.lastName + " : " + st.age);  // if don't declare attr as private
        System.out.println(st.getFirstName() + " : " + st.getLastName() + " : " + st.getAge());
    }
}

// Problem
/*
 1) Map is good but problem is that if we did any typo mistake like we put LastName instead of lastName. Then you'll be in trouble.

 2) Need to be typecast for every attribute
   st1.setFirstName((String) studentMap.put("firstName", "Khagesh"));

* */