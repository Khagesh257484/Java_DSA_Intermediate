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

package com.beginner;

public class PrintPrimeNumbers {
    static void printPrime(int n) {
        int flag = 0;
        if (n == 2 || n == 3)   // Corner cases
            System.out.println(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
            flag=1;
        }
        if (flag == 0)
            System.out.println(n);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 21; i++) {
            printPrime(i);
        }
    }
}
