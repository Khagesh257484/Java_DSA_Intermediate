package com.company.java.dsa.pattern;

import java.util.ArrayList;
import java.util.Scanner;

/*
   for n=4, print below pattern
   Fibonacci : sum of first term and second term will be the next term & first term will be always 0 and second term will be 1
   FT=0, LT=1, NT=(FT+LT)=1
   FT=LT=1, LT=NT=1, NT=2 .... like that
 0
 1 1
 2 3 5
 8 13 21 34
* */
public class FibonacciPattern {
    public static void main(String[] args) {
        int n=6;
        int b=1;
        int sum=0;
        // for n=4
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(sum + " ");
                sum+=b;
                b=sum-b;
            }
            System.out.println();
        }

    }
}
