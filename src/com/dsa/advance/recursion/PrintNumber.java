/*
 Question : For a given number n, print number from 1 to n and n to 1
* */

package com.dsa.advance.recursion;

public class PrintNumber {
    static void printNumber(int n) {
        // One way to print number
        if (n >= 1) {
            System.out.println(n);      // This will print the number from 1 to N
            printNumber(n - 1);
            //System.out.println(n);     // This will print the number from N to 1

        }

    }

    static void printNumber2(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        //System.out.println(n);
        printNumber2(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        //printNumber(5);
        printNumber2(6);

    }
}
