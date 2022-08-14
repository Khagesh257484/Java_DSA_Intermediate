/*
Q1. Sum of Digits!
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a number A, we need to find the sum of its digits using recursion.



Problem Constraints
1 <= A <= 109



Input Format
The first and only argument is an integer A.



Output Format
Return an integer denoting the sum of digits of the number A.



Example Input
Input 1:

 A = 46
Input 2:

 A = 11


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

 Sum of digits of 46 = 4 + 6 = 10
Explanation 2:

 Sum of digits of 11 = 1 + 1 = 2

* */

/*
  Example 1 : int A=246 , sum=12

  Approach :
      1) We need to find the sum of Digits that means it will be 2+4+6
          6 is last digit, How can get last digit (using modulo with 10 )
          then again we need number 4 but number is 246, so if we divide it by 10(n/10) then we will get quotient is 24 & we can update
          number as quotient

      2) So find last digit of number till number becomes of one digit and add all digits

* */
package com.dsa.advance.recursion;

public class SumOfDigits {
    // A=275, Sum=14
    public static int sum(int A) {
        // Base case
        if (A < 10)
            return A;

        // Main logic
        // last digit of number + update number
        return A % 10 + sum(A / 10);

    }

    public static void main(String[] args) {
        System.out.println(sum(9));
        System.out.println(sum(325));
    }
}
