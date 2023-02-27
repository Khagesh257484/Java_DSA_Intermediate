/*
Q1. Binary to Decimal - II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Take a number A as input in binary format (Base = 2). You have to print the number in decimal format (Base = 10).


Problem Constraints
1 <= A <= 210



Input Format
First and only line contains a single binary number A.



Output Format
Print in a single line, a decimal integer.



Example Input
Input 1:

 11
Input 2:

 1011


Example Output
Output 1:

 3
Output 2:

 11


Example Explanation
Explanation 1:

 (0011)2 = (21 + 20)10 = (3)10
Explanation 2:

 (1010)2 = (23+ 21 + 20)10 = (11)10
* */

package com.beginner.basic;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(int a) {
        double power = 0, result = 0;
        while (a != 0) {
            int rem = a % 10;
            result += rem * Math.pow(2, power);
            power++;
            a = a / 10;
        }
        return (int) result;
    }

    public static long binaryToDecimal_sclr(long a) {
        double power = 0, result = 0;
        while (a != 0) {
            long rem = a % 10;
            result += rem * Math.pow(2, power);
            power++;
            a = a / 10;
        }
        return (long) result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(binaryToDecimal(number));

        // For scaler version
        String numberString=sc.next();
        long num=Long.parseLong(numberString);
        System.out.println(binaryToDecimal_sclr(num));


    }
}
