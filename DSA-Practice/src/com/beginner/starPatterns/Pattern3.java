/*
Q1. Star Pattern II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to input an integer N from user and print hollow inverted right triangle star pattern of N lines using '*'.

See example for clarifications.



Problem Constraints

1 <= N <= 1000



Input Format

First line is an integer N



Output Format

N lines conatining only char '*' as per the question.



Example Input

Input 1:

7
Input 2:

4


Example Output

Output 1:

*******
*    *
*   *
*  *
* *
**
*
Output 2:

****
* *
**
*
* */

package com.beginner.starPatterns;

public class Pattern3 {
    static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(7);
    }
}
