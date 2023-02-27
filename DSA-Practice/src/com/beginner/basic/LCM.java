/*
Q1. LCM
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a function that takes to positive integers A and B and returns their LCM.


Problem Constraints
1 <= A,B <= 109


Input Format
The first argument is a single integer A
The second argument is a single integer B


Output Format
Return a single integer that is the LCM of A and B.


Example Input
Input 1:
A = 5
B = 10
Input 2:

A = 2
B = 3


Example Output
Output 1:
10
Output 2:

6


Example Explanation
Explanation 1:
LCM(5,10)=10
Explanation 2:

LCM(2,3)=6
* */

package com.beginner.basic;

import java.util.Scanner;

public class LCM {

    static int getGCD(int A, int B) {
        int remainder = A % B;
        while (remainder != 0) {
            A = B;
            B = remainder;
            remainder = A % B;
        }
        return B;
    }

    static int getLCM(int A, int B) {
        int gcd = getGCD(A, B);
        int lcm = (A * B) / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(getLCM(n1, n2));
    }
}
