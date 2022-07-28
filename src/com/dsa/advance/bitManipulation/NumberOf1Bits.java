/*
Q3. Number of 1 Bits
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument contains integer A


Output Format
Return an integer as the answer


Example Input
Input1:
11


Example Output
Output1:
3


Example Explanation
Explaination1:
11 is represented as 1011 in binary.
* */

package com.dsa.advance.bitManipulation;

public class NumberOf1Bits {
    static int numberOf1Bits(int A) {
        int count = 0;
        while (A > 0) {
            if ((A & 1) != 0)
                count++;
            A = A >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1Bits(3));
        System.out.println(numberOf1Bits(2));
        System.out.println(numberOf1Bits(5));
    }
}
