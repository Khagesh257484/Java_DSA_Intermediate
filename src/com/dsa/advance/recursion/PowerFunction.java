/*
Q3. Implement Power Function
Solved
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

package com.dsa.advance.recursion;

public class PowerFunction {

    // Function without mod value
    static int powWithoutMod(int A, int B, int C) {
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;
        if (B == 1)
            return A;

        if (B % 2 == 0)
            return powWithoutMod(A * A, B / 2, C);
        else
            // powWithoutMod(A, B % 2, C) : This is nothing but A so replacing with A in return function
            return A * powWithoutMod(A, B - 1, C);
    }

    static int pow(int A, int B, int C) {
        // Base Condition
        if (A == 0 || A == 1)
            return A;
        if (B == 0)
            return 1;
        if (B == 2)
            return (A * A) % C;

        long mid = B / 2;

        // https://siddarthkanted.wordpress.com/2019/04/21/implement-power-function-for-large-numbers-recursive-solution-interviewbit-java/

        // Main Logic :: this is recursive function
        long halfPower = (long) (pow(A, B / 2, C)) % C;
        long power = ((halfPower % C) * (halfPower % C)) % C;

        // returning value
        if (B % 2 == 0)
            return (int) (power);  // if power is even
        else
            return (int) ((power * (A % C) + C) % C) % C;   // if power is odd
    }

    public static void main(String[] args) {
        // Test case for without mod value function
        System.out.println(powWithoutMod(2, 81, 3));  // You can check result of this case, it will be 0. reason behind is that
        // when we are calculating the value with the highest power it is going beyond the range of Integer, so giving 0. To fit in range we need to take mod
        System.out.println(powWithoutMod(2, 21, 3));
        System.out.println(powWithoutMod(2, 5, 3));


        // Test cases for with mod value function
        System.out.println(pow(2, 81, 3));
    }
}
