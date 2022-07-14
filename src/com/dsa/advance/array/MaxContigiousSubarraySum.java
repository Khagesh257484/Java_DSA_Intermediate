/*
Q3. Max Sum Contiguous Subarray
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10]
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


Example Output
Output 1:

 10
Output 2:

 6


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6.



See Expected Output
Your input
9 3 -4 6 -8 -10 4 7 2 -3
Output
13

* */


package com.dsa.advance.array;

public class MaxContigiousSubarraySum {
    public static int maxSubArray(final int[] A) {
        // 1 2 3 4 -10
        int n = A.length, currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currSum = currSum + A[i];  //carry Forward technique
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

    }
}
