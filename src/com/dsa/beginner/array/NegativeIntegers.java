package com.ggl.practice.array;

import java.util.Scanner;

/*
 * Write a program to print all negative numbers from input array A of size N where you have to take integer N and
 * further N elements as input from user.
 * */
public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Declaring size of an array
        int a[] = new int[size];

        // taking input from user for each element of an array
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Iterate or Traverse the element of an array
        for (int i = 0; i < a.length; i++) {
            // print all negative element
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }

        }


    }
}
