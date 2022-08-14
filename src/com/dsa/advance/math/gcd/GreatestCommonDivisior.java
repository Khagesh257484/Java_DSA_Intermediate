/*
Q3. Greatest Common Divisor
Attempted
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given 2 non-negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.

Note: DO NOT USE LIBRARY FUNCTIONS.



Problem Constraints
0 <= A, B <= 109



Input Format
First argument is an integer A.
Second argument is an integer B.



Output Format
Return an integer denoting the gcd(A, B).



Example Input
Input 1:

A = 4
B = 6
Input 2:

A = 6
B = 7


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 2 divides both 4 and 6
Explanation 2:

 1 divides both 6 and 7
* */
package com.dsa.advance.math.gcd;

public class GreatestCommonDivisior {

    // Linear Approach will take time complexity : O(Min(A,B))
    public static int gcd(int A, int B) {
        if (B == 0)
            return A;

        int min = Math.min(A, B);
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Recursive Approach
    /*
      Remember how we find the GCD in school days the same approach will work here.
      1) Divide 36 by 12 , will get remainder 0 and quotient will be 12

      2) Divide 12 by 0, then you will get 12

    * */

    static int gcd_recursive(int A, int B) {
        if (A == 0)
            return B;
        return gcd_iterative(B % A, A);

        // This is wrong approach, check why is that
       /* if (B == 0)
            return A;
        return gcd_recursive(B, B%A);*/
    }

    // Iterative Approach : It is faster than recursive approach
    static int gcd_iterative(int A, int B) {
        while (A != 0) {
            int A_ = B % A;
            int B_ = A;
            A = A_;
            B = B_;
        }
        return B;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 36));
        System.out.println(gcd_recursive(12, 36));
        System.out.println(gcd_iterative(12, 36));
    }
}
