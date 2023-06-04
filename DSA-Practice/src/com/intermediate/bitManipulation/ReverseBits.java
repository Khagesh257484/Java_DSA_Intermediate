/*
Q3. Reverse Bits
Solved
Hint bulb icon
Stuck somewhere?
Using hints is now penalty free
Check Now
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

package com.intermediate.bitManipulation;

public class ReverseBits {
    public static long reverse(long A) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((A & (1 << i)) != 0) {
                System.out.println(rev);
                rev |= 1;
                System.out.println(rev+"If ke andar bandar");
            }
           // System.out.println(rev);
        }
        return rev;

    }

    public static void main(String[] args) {
        System.out.println(reverse(11));
    }
}
