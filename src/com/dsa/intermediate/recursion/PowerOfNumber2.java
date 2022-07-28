/*
Q2. Implement Power Function
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

package com.dsa.intermediate.recursion;

public class PowerOfNumber2 {
    public int pow(int A, int B, int C) {

        // Base Condition
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        // Main Logic :: this is recursive function
        long p = (long) (pow(A, B / 2, C)) % C;
        long halfPow = ((p % C) * (p % C)) % C;

        // returning value
        if (B % 2 == 0)
            return (int) (halfPow);  // if power is even
        else
            return (int) ((halfPow * (A % C) + C) % C) % C;   // if power is odd
    }

    // https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/?ref=lbp
    // Do without recursion



    public static void main(String[] args) {

        PowerOfNumber2 pn = new PowerOfNumber2();
        System.out.println(pn.pow(-1, 1, 20));
        System.out.println(pn.pow(2, 4, 3));

    }
}
