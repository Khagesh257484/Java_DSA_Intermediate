/*
Q1. Number of 1 Bits
Solved
Hint bulb icon
Stuck somewhere?
Using hints is now penalty free
Check Now
Problem Description
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument contains integer A


Output Format
Return an integer


Example Input
Input 1:
11
Input 2:
6


Example Output
Output 1:
3
Output 2:
2
* */

package com.intermediate.bitManipulation;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(11));
        System.out.println(countSetBits(6));
    }
}
