/*
Q2. Subarrays with Bitwise OR 1
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array B of length A with elements 1 or 0. Find the number of subarrays with bitwise OR 1.


Problem Constraints
1 <= A <= 105


Input Format
The first argument is a single integer A.
The second argument is an integer array B.


Output Format
Return the number of subarrays with bitwise array 1.


Example Input
Input 1:
 A = 3
B = [1, 0, 1]
Input 2:
 A = 2
B = [1, 0]


Example Output
Output 1:
5
Output2:
2


Example Explanation
Explanation 1:
The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
Explanation 2:
The subarrays are :- [1], [0], [1, 0]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
* */

package com.dsa.intermediate.bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithBitwiseOr {
    public static Long solve(int A, ArrayList<Integer> B) {
        int zeroCount = 0;
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i) == 0)
                zeroCount++;
        }
        long b = A * (A + 1) / 2;
        return b - zeroCount;
    }

    public static long getNumberOfSubArrays(int A, int[] B) {
        long aLength = A;
        long totalSubArray = aLength * (aLength + 1) / 2;
        long totalconZero = 0, zeroCount = 0;

        for (int i = 0; i < aLength; i++) {
            if (B[i] == 0) {
                zeroCount++;
            }
            if (B[i] == 1 || i == aLength - 1) {
                if (zeroCount == 1) {
                    totalconZero++;
                } else {
                    totalconZero = totalconZero + (zeroCount * (zeroCount + 1) / 2);
                }
                zeroCount = 0;
            }
        }

        return totalSubArray - totalconZero;


    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 0, 1));
        System.out.println(solve(3, al));
    }
}
