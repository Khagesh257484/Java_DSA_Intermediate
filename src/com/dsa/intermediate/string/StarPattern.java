package com.dsa.intermediate.string;

import java.util.Scanner;

/*
Q2. Star Pattern I
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved..
Get help from TA.
Problem Description

Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.

See example for clarifications over the pattern.



Problem Constraints

1 <= N <= 1000



Input Format

First line is an integer N



Output Format

N lines conatining only char '*' as per the question.



Example Input

Input 1:

4
Input 2:

6


Example Output

Output 1:

********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
Output 2:

************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
* */
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printStar(n);
    }

    public static void printStar(int n) {
        int startCount = n;
        for (int i = 0; i < n; i++) {
            for (int j = startCount; j > 0; j--) {
                System.out.print("*");
            }
            for (int space = 0; space < i * 2; space++) {
                System.out.print(" ");
            }
            for (int j = startCount; j > 0; j--) {
                System.out.print("*");
            }
            startCount--;
            System.out.println();
        }
        startCount = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int space = 0; space < startCount * 2; space++) {
                System.out.print(" ");
            }
            startCount--;
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
