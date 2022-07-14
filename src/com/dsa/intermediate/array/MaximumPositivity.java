/*
Q1. Maximum positivity
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, of size N.

Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

NOTE: It is guaranteed that an answer always exists.



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
The first and only argument given is the integer array A.



Output Format
Return maximum size subarray of A having only non-negative elements. If there are more than one such subarrays, return the one having earliest starting index in A.



Example Input
Input 1:

 A = [5, 6, -1, 7, 8]
Input 2:

 A = [1, 2, 3, 4, 5, 6]


Example Output
Output 1:

 [5, 6]
Output 2:

 [1, 2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 There are two subarrays of size 2 having only non-negative elements.
 1. [5, 6]  starting point  = 0
 2. [7, 8]  starting point  = 3
 As starting point of 1 is smaller, return [5, 6]
Explanation 2:

 There is only one subarray of size 6 having only non-negative elements:
 [1, 2, 3, 4, 5, 6]

* */

package com.dsa.intermediate.array;

import java.util.Arrays;

public class MaximumPositivity {
    public static int[] solve(int[] A) {
        int n = A.length;
        int startId = -1;
        int endId = -1;
        int len = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] < 0)  // If negative element then continue
                continue;

            int j = i;
            int count = 0;
            for (j = i; j < n; j++) {     // -2 -4 5 6 -2 -6 7 8 9
                if (A[j] < 0)
                    break;
                count++;

            }
            if (count > len) {
                len = count;
                startId = i;
                endId = j - 1;
            }
            i = j;
        }
        int ans[] = new int[endId - startId + 1];
        for (int i = startId; i <= endId; i++) {
            ans[i - startId] = A[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A={-2, -4, 5, 6, -2, -6, 7, 8, 9};
        System.out.println(Arrays.toString(solve(A)));

        int[] B={-2, -4, 5, 6, -2, -6, 8, 9};
        System.out.println(Arrays.toString(solve(B)));
    }
}
