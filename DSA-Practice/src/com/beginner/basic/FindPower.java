/*
Q2. Find power
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given two integers N and M, find the value of N raised to the power of M i.e. NM



Problem Constraints

1 <= N <= 10

0 <= M <= 9



Input Format

First line of input contains an integer N.

Second line of input contains an integer M.



Output Format

Print the value of NM.



Example Input

Input 1:

 2
 2
Input 2:

 3
 1


Example Output

Output 1:

 4
Output 2:

 3


Example Explanation

Explanation 1:

 N = 2, M = 2, 22 = 4.
Explanation 2:

 N = 3, M = 1, 31 = 3


* */

package com.beginner.basic;

import java.util.Scanner;

public class FindPower {
    static int getPower(int number, int power) {
        int result = 1;
        for (int i = power; i >= 1; i--) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number");
        int number=sc.nextInt();
        System.out.println("Please enter power");
        int power=sc.nextInt();
        System.out.println(getPower(number,power));
    }
}
