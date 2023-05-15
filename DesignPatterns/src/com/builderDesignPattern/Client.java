package com.builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        //Student st = new Student("Khagesh", "Sharma", "RGPV", 30, 72.4, 63.2);

        // Problem 1 :
        /*
         if only 2 parameter is required then you can't give only 2 parameters
         Student st = new Student("Khagesh","Sharma");
        */

        // problem 2 :
        /*
         if force fully we just pass only required parameters then we will end up with the multiple nulls, this is
         the not good code practice
        */

        // Problem 3 :
        /*
         To give only required attribute you've to create constructor for that attribute only.
         if you've n attributes then you'll end up with 2^n constructor combination and also have code
         duplicate in code base that is not good.
        **/


        Student st1= new Student("Khagesh","Sharma");
        Student st2=new Student("Krishna","Sharma",30);

        System.out.println("   ********** ");
        System.out.println(st1.toString());

        System.out.println(st2.getFirstName()+st1.getFirstName());

    }
}
