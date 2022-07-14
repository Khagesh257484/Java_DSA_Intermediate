/*
Q4. Subsequence-Sum Problem
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given an array of integers of N size.

You have to find that there is any subsequence exists or not whose sum is equal to B.



Problem Constraints

1 <= N <= 20
1 <= A[i] <= 100000
0 <= B <= 1e9


Input Format

First Argument is array of integers A
Second Argument is B



Output Format

Return 1 if any subsequence sum is equal to B otherwise return 0.



Example Input

Input 1:

A=[1,20,13,4,5]
B=18
Input 2:


A=[2,2,2,2]
B=5


Example Output

1
Output 1:


1
Output 2:


0


Example Explanation

Explanation 1:
 There is as subsequence present at indexes 1,3,4 whose sum is 18
Explanation 2:


There is no possible subsequence whose sum is 5
NOTE: Array is considered 1 based indexing for the above explanation.


* */

package com.dsa.intermediate.subsetAndSubsequence;

import java.util.ArrayList;

public class SubsequencesSum {

    // This is greedy technique will not work in this case [11,1,2,4,2,3]
    public int sumOfSubsequences(int[] A, int B) {
        for (int i = A.length - 1; i >= 0; i--) {
            if (B >= A[i])
                B -= A[i];
        }
        if (B != 0)
            return 0;
        else
            return 1;
    }

    // Iterative Approach having TC (n*2^n)
    // Here we are generating every subsequences and checking the sum
    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < Math.pow(2, A.size()); i++) {
            int sum = B;
            for (int j = 0; j < A.size(); j++) {
                if ((i & (1 << j)) != 0) {
                    sum = sum - A.get(j);
                }
            }
            if (sum == 0)
                return 1;
        }
        return 0;
    }


    // Reucrsion Approach : TC (2^n)
}
