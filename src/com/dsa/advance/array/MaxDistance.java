/*
Q1. Max Distance
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array, A of integers of size N. Find the maximum value of j - i such that A[i] <= A[j].



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the maximum value of j - i.



Example Input
Input 1:

A = [3, 5, 4, 2]


Example Output
Output 1:

2


Example Explanation
Explanation 1:

For A[0] = 3 and A[2] = 4, the ans is (2 - 0) = 2.



See Expected Output
Your input
5 6 3 5 2 4
Output
3
* */

package com.dsa.advance.array;

import java.util.ArrayList;
import java.util.Arrays;

// https://medium.com/solvingalgo/solving-algorithmic-problems-max-distance-in-an-array-7e8c9f71c8b

public class MaxDistance {

    public static int maximumGap(final ArrayList<Integer> A) {
        int maxDiff;
        int i, j;

        int n = A.size();
        int RMax[] = new int[n];
        int LMin[] = new int[n];

        LMin[0] = A.get(0);

        for (i = 1; i < n; ++i) {
            LMin[i] = Math.min(A.get(i), LMin[i - 1]);
        }

        RMax[n - 1] = A.get(n - 1);
        for (j = n - 2; j >= 0; --j) {
            RMax[j] = Math.max(A.get(j), RMax[j + 1]);
        }

        i = 0; j = 0; maxDiff = 0;
        while (j < n && i < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            }
            else {
                i++;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>(Arrays.asList(6, 3, 5, 2, 4, 6));
        int[] A = {6, 3, 5, 2, 4, 6};
        System.out.println(maximumGap(al));

        ArrayList<Integer> al1= new ArrayList<>(Arrays.asList(3, 5, 4, 2));
        System.out.println(maximumGap(al1));
    }
}
