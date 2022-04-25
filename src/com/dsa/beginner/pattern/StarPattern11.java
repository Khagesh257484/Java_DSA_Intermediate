package com.company.java.dsa.pattern;

import java.util.Scanner;

/*

 *******
 *    *
 *   *
 *  *
 * *
 **
 *

 * */
public class StarPattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == (i) || i==n)
                    /*
                    *  j==1, will print single star in first column
                    *  i==n  will print n no of star in first line
                    * */
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
