package com.dsa.intermediate.recursion;
/*
 Question : Print HelloWorld using recursion  n times.....
* */
public class PrintHelloWorld {
    void print(int n) {
        if (n > 0) {
            print(n - 1);
            System.out.println("HelloWorld.....");
        }
        // print(n - 1); This will go till infinite because base condition is not satisfying here. We're calling method out of base condition.
    }

    public static void main(String[] args) {
        PrintHelloWorld test = new PrintHelloWorld();
        test.print(5);

    }

}
