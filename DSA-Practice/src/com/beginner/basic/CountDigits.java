/*
Q1. Coun  bt the digits
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the count of digits of that number.

Note: No of digits for number 0 is considered as 1.

Problem Constraints

1 <= T <= 100
0 <= N <= 100000000
Input Format

The first line is the number T which denotes the total number of test cases.
Next T lines contain an integer N for which you have to print the number of digits.
Output Format

For T different Numbers, Print the number of digits in separate lines.
Example Input

Input 1:
2
0
1

Input 2:
2
100
10101
Example Output

Output 1:
1
1
Output 2:
3
5
Example Explanation

Explanation 1:
0 and 1 both have only one digit.
Explanation 2:
100 has three digits and 10101 has 5 digits.
* */

package com.beginner.basic;

import java.util.Scanner;

public class CountDigits {

    public static int digitCounter(int n){
        int digit=0;
        while(n!=0){
            n/=10;
            digit++;
        }
        return digit;
    }
    public static void main(String[] args) {
        // Take user input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(digitCounter(n));

    }
}
