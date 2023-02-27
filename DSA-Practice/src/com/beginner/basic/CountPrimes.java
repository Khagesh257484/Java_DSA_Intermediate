/*
Q2. Count of primes
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.


Problem Constraints
0 <= n <= 10^3


Input Format
Single input parameter n in function.


Output Format
Return the count of prime numbers less than or equal to n.


Example Input
Input 1: 19
Input 2: 1


Example Output
Output 1: 8
Output 2: 0


Example Explanation
Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
Explanation 2: There are no primes <= 1

* */

package com.beginner.basic;

import java.util.Scanner;

public class CountPrimes {
    static boolean isPrime(int n) {
        int i = 2;
        for (; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (i == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;
        for (int i = 2; i <= number; i++) {
            boolean prime = isPrime(i);
            if (prime)
                count++;
        }
        if (count == 0) {
            System.out.println("There is no prime number ");
        }
        else
            System.out.println(count);

    }
}
