/*
Q2. Sum the digits
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the sum of digits of that number.

Problem Constraints

1 <= T <= 1000
0 <= N <= 100000000
Input Format

The first line is T which means the total number of test cases.
Each of the next T lines contain an integer N.
. Output Format

T lines each containing one integer representing the sum of the digits of the input integer.
Example Input

Input 1:
2
5
1001

Input 2:
2
123
1589
Example Output

Output 1:
5
2

Output 2:
6
23
Example Explanation

Explanation 1:
5 has only 1 digit hence sum is 5.
Sum(1001) = 1+0+0+1 = 2.

Explanation 2:
Sum(123) = 1+2+3 = 6.
Sum(1589) = 1+5+8+9 = 23.
* */

package com.beginner.basic;

import java.util.Scanner;

public class DigitSum {
    public static int sumOfDigits(int n){
        int sum=0;
        while (n!=0){
            int r= n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println(sumOfDigits(number));
    }
}
