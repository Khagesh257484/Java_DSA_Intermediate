package com.dsa.intermediate.recursion;

import java.util.Scanner;

// print n number from 1 to n using recursion
public class PrintNumberUsingRecursion {
    public static void printNumberInDecreasingOrder(int n) {
        int i=1;
        if(n<i){
            System.out.println("Breaking Recursion.......");
            return;
        }
        System.out.print(n+" ");
        printNumberInDecreasingOrder(n-i);
    }

    public static void printNumberInIncreasingOrder(int n){
        int org=n;

        if(1 >= org){
            System.out.println("Break");
            return;
        }
        System.out.println(n);
        printNumberInIncreasingOrder(1+1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNumberInDecreasingOrder(n);
        printNumberInIncreasingOrder(n);
    }
}
