/*
 Q2. Sum of All Subarrays
Solved
Hint bulb icon
Stuck somewhere?
Using hints is now penalty free
Check Now
Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note :
1. Try to figure out the contribution of A[i] in the sum of all subarray sums.
2. In another word, for A[i], try to find count of A[i] in entire subarray sums.



Problem Constraints
1 <= N <= 105
1 <= Ai <= 10 4


Input Format
The first argument is the integer array A.


Output Format
Return a single integer denoting the sum of all subarray sums of the given array.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:

A = [2, 1, 3]


Example Output
Output 1:
20
Output 2:

19


Example Explanation
Explanation 1:
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
Explanation 2:

The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19


* */

package com.intermediate.array;

public class SumOfSubArraysSums {
    // Carry forward technique

    public static int sumOfAllSubArraysSum(int[] arr, int n) {
        int ans=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                ans=ans+sum;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(sumOfAllSubArraysSum(arr, arr.length));
    }
}
