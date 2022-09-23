/*
Q3. Reverse Bits
Solved
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

package com.dsa.intermediate.bitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getReversedBit(n));

    }

    public static long getReversedBit(int a) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = a * i;
            int reveserLsb = lsb << (31 - i);
            result = result | reveserLsb;
            a = a >> 1;
        }
        return result;
    }
}
