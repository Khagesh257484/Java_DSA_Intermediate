/*
Q1. Sum the Difference
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array, A of size N.
You have to find all possible non-empty subsequences of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence. Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.



Problem Constraints
1 <= N <= 10000

1<= A[i] <=1000



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the output.



Example Input
Input 1:

A = [1, 2]
Input 2:

A = [1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

All possible non-empty subsets are:
[1]    largest-smallest = 1 - 1 = 0
[2]    largest-smallest = 2 - 2 = 0
[1 2]  largest-smallest = 2 - 1 = 1
Sum of the differences = 0 + 0 + 1 = 1
So, the resultant number is 1
Explanation 2:

 Only 1 subsequence of 1 element is formed.

* */
package com.dsa.advance.sorting;

import java.util.Arrays;

// Refer this : https://www.youtube.com/watch?v=kSo8W6ZGYqw
public class SumOfSubSeqWidth {
    public static int solve(int[] A) {
        Arrays.sort(A);     // Sorting cause getting min and max from any sub seq does not change min and max for that sub seq.
        long mod = 1000000007;
        int n = A.length;
        long ans = 0;         // ans can be beyond the range of Integer so taking long.

        long[] pow = new long[n];
        pow[0] = 1;      // if any number has power 0 then it will be 1

        // Finding power because at every step we need to multiply with power.
        for (int i = 1; i < n; i++) {
            pow[i] = (2 * pow[i - 1]) % mod;
        }
        // System.out.println(Arrays.toString(pow));

        // 1 2 3
        for (int i = 0; i < n; i++) {
            // ans+=A[i]*2^i-A[i-1]*2^n-i-1
            ans = (ans + A[i] * (pow[i] - pow[n - i - 1])) % mod;
        }
        return (int) ans;

    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2};
        System.out.println(solve(a));
    }
}
