/*
Q4. Square root of a number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Problem Constraints

1 <= A <= 108
Input Format

First and the only argument is an integer A.
Output Format

Return an integer which is the square root of A if A is perfect square otherwise return -1.
Example Input

Input 1:
A = 4
Input 2:

A = 1001
Example Output

Output 1:
2
Output 2:

-1
Example Explanation

Explanation 1:
sqrt(4) = 2
Explanation 2:

1001 is not a perfect square.
* */

package com.intermediate.array;

// -ve number can't be perfect square.
public class IsPerfectSquare {
    public static int isPerfectSquare(int number) {
        int half = number / 2;
        for (int i = 1; i <= half; i++) {
            if (i * i == number)
                return 1;
        }
        return -1;
    }

    // Fast method from previous cause calculating square at time of looping (i*i)
    public static boolean perfectSquare(int number) {
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0 && number / i == i)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(1001));

        // second method test cases
        System.out.println(perfectSquare(9));
        System.out.println(perfectSquare(11));
    }
}
