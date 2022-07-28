/*
Q2. Implement Power Function
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).

Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.



Problem Constraints
-109 <= A <= 109
0 <= B <= 109
1 <= C <= 109


Input Format
Given three integers A, B, C.


Output Format
Return an integer.


Example Input
A = 2, B = 3, C = 3


Example Output
2


Example Explanation
23 % 3 = 8 % 3 = 2

* */

package com.dsa.advance.math.modulo;

public class PowerFunctionImpl {

    // Recursive solution
    public static int pow(int A, int B, int C) {
        //return ((int) Math.pow(A, B)) % C;
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        long p = (long) (pow(A, B / 2, C)) % C;
        long halfPow = ((p % C) * (p % C)) % C;

        if (B % 2 == 0)
            return (int) (halfPow);
        else
            return (int) ((halfPow * (A % C) + C) % C) % C;
    }

    // Binary or Bit Manipulation
    static int powerUsingBit(int x, int y) {
        int result = 1;
        while (y > 0) {
            if (y % 2 != 0) // y is odd
            {
                result = result * x;
            }
            x = x * x;
            y = y >> 1; // y=y/2;
        }
        return result;
    }

    // Divide and Conquer technique
    static int power(int x, int y) {
        int temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3, 3));
    }
}
