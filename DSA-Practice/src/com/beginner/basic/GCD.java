/*
Q1. Greatest Common Divisor
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given 2 non-negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.

Note: DO NOT USE LIBRARY FUNCTIONS.



Problem Constraints
0 <= A, B <= 109



Input Format
First argument is an integer A.
Second argument is an integer B.



Output Format
Return an integer denoting the gcd(A, B).



Example Input
Input 1:

A = 4
B = 6
Input 2:

A = 6
B = 7


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 2 divides both 4 and 6
Explanation 2:

 1 divides both 6 and 7
* */

package com.beginner.basic;

import java.util.Scanner;

public class GCD {  // It is also called HCF

    static int hcf_using_loop(int A, int B) {
        if (A == 0) {
            return B;
        } else if (B == 0) {
            return A;
        }

        int number = Math.min(A, B);
        int gcd = 1;
        for (int i = 1; i <= number; i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    static int gcd(int A, int B) {
        // to handle corner cases
        if (A == 0)
            return B;
        else if (B == 0) {
            return A;
        }

        // Actual Logic
        int remainder = A % B;
        while (remainder != 0) {
            A = B;
            B = remainder;
            remainder = A % B;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(gcd(number1, number2));
    }
}
