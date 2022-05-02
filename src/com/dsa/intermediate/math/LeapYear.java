package com.dsa.intermediate.math;
/*
Problem Description
Given an integer A representing a year, Return 1 if it is a leap year else, return 0.
A year is a leap year if the following conditions are satisfied:

The year is multiple of 400.
Else the year is multiple of 4 and not multiple of 100.


Problem Constraints
1 <= A <= 109

Input Format
First and only argument is an integer A

Output Format
Return 1 if it is a leap year else return 0


Example Input
Input 1
 A = 2020

Input 2:
 A = 1999

Example Output
Output 1
 1

Output 2:
 0

Example Explanation
Explanation 1
 2020 is a leap year.

Explanation 2:
 1999 is not a leap year.

* */

public class LeapYear {

    /*

Leap Year contains 366 days, which comes once every four years. Every leap year corresponds to these facts :

A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
A leap year (except a century year) can be identified if it is exactly divisible by 4.
A century year should be divisible by 4 and 100 both.
A non-century year should be divisible only by 4.

 * */

    public int solve(int A) {
        int flag = 0;
        //Leap Year contains 366 days, which comes once every four years. That's why dividing with 4
        //A non-century year should be divisible only by 4.
        if (A % 4 == 0) {
            flag = 1;
            // Century year should divisible by 4 and 100 both
            if (A % 100 == 0) {
                if (A % 400 == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }

        } else {
            flag = 0;
        }
        if (flag == 1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.solve(2020));
        System.out.println(leapYear.solve(1999));
        System.out.println(leapYear.solve(2000));
    }
}
