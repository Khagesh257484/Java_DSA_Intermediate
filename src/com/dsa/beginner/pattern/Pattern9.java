package com.company.java.dsa.pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper Pattern
        for (int i = 1; i <= n; i++) { // for n=3
            // Space loop (n-1), one increment on each step (n-i), taking i because will increment on each step
            for (int j = 1; j <= n - i; j++) {
                System.out.print("S ");
            }
            // Print Star, for n=3 , will print 1-firs line 2-second line  3- star in 3rd line star

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print Lower Pattern
        for (int i = n - 1; i >= 1; i--) {  // n=3, i=2
            // Space will print in increasing order line by line respectively 1, 2, 3 .... n
            for (int j = 1; j <= n - i; j++) {
                System.out.print("S ");
            }
            // Print Star in decreasing order 2 1, not 3 because in reverse pattern is already printed
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
