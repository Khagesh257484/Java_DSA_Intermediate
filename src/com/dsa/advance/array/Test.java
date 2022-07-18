package com.dsa.advance.array;

public class Test {
    public static int maxSubArray(final int[] A) {
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
        int a = -10;
        System.out.println(Math.abs(a));
    }
}
