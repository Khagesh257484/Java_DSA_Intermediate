package com.dsa.intermediate.recursion;

public class PrintHelloWorld {
    // print Hello World 5 times
    public static void main(String[] args) {
        message();
        // we can call method 5 times but let don't do in this way
    }

    // Can create 4 more methods to print this
     static void message() {
        message1();
         System.out.println("Hello World");
    }
    static void message1() {
        message2();
        System.out.println("Hello World");
    }
    static void message2() {
        message3();
        System.out.println("Hello World");
    }
    static void message3() {
        message4();
        System.out.println("Hello World");
    }
    static void message4() {
        System.out.println("Hello World");
    }
}
