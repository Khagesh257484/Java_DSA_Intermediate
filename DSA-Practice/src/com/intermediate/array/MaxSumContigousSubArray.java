/*
Q1. Max Sum Contiguous Subarray
Solved
Hint bulb icon
Stuck somewhere?
Using hints is now penalty free
Check Now
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



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
* */
package com.intermediate.array;

public class MaxSumContigousSubArray {
    public static int maxSum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static int maxSum_OptimizedOne(int[] arr, int n) {
        int max = Integer.MIN_VALUE, currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum +=arr[i];
            max = Math.max(currentSum, max);

            if (currentSum < 0)
                currentSum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -10};
        System.out.println(maxSum(arr, arr.length));
        System.out.println(maxSum_OptimizedOne(arr,arr.length));

        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(arr1, arr1.length));
        System.out.println(maxSum_OptimizedOne(arr1,arr1.length));
    }
}
