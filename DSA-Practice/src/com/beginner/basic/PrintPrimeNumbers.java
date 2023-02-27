/*
Problem Description

You are given an integer N you need to print all the Prime Numbers between 1 and N.

Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.


Problem Constraints

1 <= N <= 300



Input Format

First and only line of input contains a single integer N.



Output Format

Print all the prime numbers between between 1 and N each in a new line.



Example Input

Input 1:

 5
Input 2:

 10


Example Output

Output 1:

 2
 3
 5
Output 2:

 2
 3
 5
 7


Example Explanation

Explanation 1:

 Prime numbers between [1, 5] are (2, 3, 5).
Explanation 2:

 Prime numbers between [1, 10] are (2, 3, 5, 7)
**/

package com.beginner.basic;

import java.util.Scanner;

public class PrintPrimeNumbers {
    static void printPrime(int n) {
        int i = 2;
        for (; i < n; i++) {
            if (n % i == 0)
                break;
        }
        if (i == n)
            System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            printPrime(i);
        }
    }
}


