/*
Q2. Days In Month
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given an integer A.

You have to tell how many days are there in the month denoted by A in a non-leap year.

Months are denoted as follows:

January : 1
February : 2
March : 3
April : 4
May : 5
June : 6
July : 7
August : 8
September : 9
October : 10
November : 11
December : 12


Problem Constraints

1 <= A <= 12



Input Format

The input contains a single integer A.



Output Format

Print a single integer denoting the number of days on a single line.



Example Input

Input 1:

 1
Input 2:

 11


Example Output

Output 1:

 31
Output 2:

 30


Example Explanation

Explanation 1:

 Number of days in January(1) in a non-leap year = 31.
Explanation 2:

 Number of days in November(11) in a non-leap year = 30.

 * */


package com.beginner.basic;

import java.util.*;

public class DaysInMonth {
    public static int daysInMonth(int n) {
        switch (n) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 30;
            case 4:
                return 31;
            case 5:
                return 30;
            case 6:
                return 31;
            case 7:
                return 30;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int days = daysInMonth(n);
        System.out.println(days);



    }
}
