package com.dsa.intermediate.array.subarrays;

public class MaxSumContigousSubarray {
    public int maxSubArray(final int[] A) {
        int n = A.length, currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currSum += A[i];
            if (currSum > maxSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumContigousSubarray ms = new MaxSumContigousSubarray();
        int[] a = {1, 2, 3, 4, -10};
        int[] b = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(ms.maxSubArray(a));
        System.out.println(ms.maxSubArray(b));

    }
}
