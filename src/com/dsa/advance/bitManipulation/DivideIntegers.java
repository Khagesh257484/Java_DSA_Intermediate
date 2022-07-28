/*
Q2. Divide Integers
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Divide two integers without using multiplication, division and mod operator.

Return the floor of the result of the division.

Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

NOTE: INT_MAX = 2^31 - 1



Problem Constraints
-231 <= A, B <= 231-1

B != 0



Input Format
The first argument is an integer A denoting the dividend.
The second argument is an integer B denoting the divisor.



Output Format
Return an integer denoting the floor value of the division.



Example Input
Input 1:

 A = 5
 B = 2
Input 2:

 A = 7
 B = 1


Example Output
Output 1:

 2
Output 2:

 7


Example Explanation
Explanation 1:

 floor(5/2) = 2

* */

// https://www.geeksforgeeks.org/write-an-iterative-olog-y-function-for-powx-y/?ref=lbp

// https://www.geeksforgeeks.org/divide-two-integers-without-using-multiplication-division-mod-operator/
package com.dsa.advance.bitManipulation;

public class DivideIntegers {
    public static int divide(int x, int y) {
        long A=x;
        long B=y;

        // Check both number sign, is negative and positive and update accordingly
        int sign = 0;
        if ((A < 0) ^ (B < 0))
            sign = -1;
        else
            sign = 1;

        // Find absolute value or positive value for both number even it is negative, will change at time of returning
        A = Math.abs(A);
        B = Math.abs(B);

        // Perform division operation
        long quotient = 0;
        while (A >= B) {
            A = A - B;
            ++quotient;
        }

        if (sign == -1)
            quotient = -quotient;

        if (quotient > Integer.MAX_VALUE)
            quotient = Integer.MAX_VALUE;


        return (int)quotient;

    }

    // Bit Manipulation technique
    public static long divide(long dividend, long divisor) {

// Calculate sign of divisor
// i.e., sign will be negative
// only if either one of them
// is negative otherwise it
// will be positive
        long sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

// remove sign of operands
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

// Initialize the quotient
        long quotient = 0, temp = 0;

// test down from the highest
// bit and accumulate the
// tentative value for
// valid bit
// 1<<31 behaves incorrectly and gives Integer
// Min Value which should not be the case, instead
        // 1L<<31 works correctly.
        for (int i = 31; i >= 0; --i) {

            if (temp + (divisor << i) <= dividend) {
                temp += divisor << i;
                quotient |= 1L << i;
            }
        }

//if the sign value computed earlier is -1 then negate the value of quotient
        if (sign == -1)
            quotient = -quotient;
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
        System.out.println(divide(-2147483648L, -1L));
    }
}
