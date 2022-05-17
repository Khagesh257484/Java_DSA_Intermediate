package com.dsa.intermediate.recursion;

/*
Question : Print numbers in increasing and decreasing order for number n using recursion.
* */


public class PrintNumberUsingRecursion {

    public void printNumber(int n){
        if(n>=1){
            System.out.println(n);  // If use this here, then print in decreasing order
            printNumber(n-1);
           // System.out.println(n);   // if use here, then print in increasing order
        }

        /*
                // This again will go till infinite
        System.out.println(n);
        printNumber(n-1);

        */
    }

    public static void main(String[] args) {
        PrintNumberUsingRecursion test=new PrintNumberUsingRecursion();
        test.printNumber(5);

    }
}
