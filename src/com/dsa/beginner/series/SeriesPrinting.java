package com.company.java.dsa.series;

import java.util.Scanner;

/*

Take the following as input.

A number (N1) A number (N2) Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

Sample Input:
10 4
Sample Output:
5 11 14 17 23 26 29 35 38 41
Explanation:
The output will've N1 terms which are not divisible by N2.

*
* */


public class SeriesPrinting {
    public static void printSeries(int terms, int multiple) {
        int number = 1;
        for (int count = 0; count < 10; number++) {
            int sn = 3 * number + 2;
            if (sn % 4 != 0) {
                System.out.print(sn + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        printSeries(n1, n2);

    }
}
