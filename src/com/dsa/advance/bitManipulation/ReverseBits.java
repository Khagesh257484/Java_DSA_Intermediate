/*
Q4. Reverse Bits
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Reverse the bits of an 32 bit unsigned integer A.



Problem Constraints
0 <= A <= 232



Input Format
First and only argument of input contains an integer A.



Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.



Example Input
Input 1:

 0
Input 2:

 3


Example Output
Output 1:

 0
Output 2:

 3221225472


Example Explanation
Explanation 1:

        00000000000000000000000000000000
=>      00000000000000000000000000000000
Explanation 2:

        00000000000000000000000000000011
=>      11000000000000000000000000000000
* */

package com.dsa.advance.bitManipulation;

public class ReverseBits {
    static long reverse(int A) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            if ((A & (1 << i)) != 0)
                rev = rev | 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(3));
    }
}
