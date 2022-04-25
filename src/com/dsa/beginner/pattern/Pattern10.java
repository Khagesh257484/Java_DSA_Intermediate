package com.company.java.dsa.pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //Space loop
            for (int k = i; k <= n - 1; k++) {
                System.out.print("S ");
            }
            // Star loop
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
