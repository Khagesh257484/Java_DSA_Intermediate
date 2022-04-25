package com.dsa.intermediate.array.subarrays;

public class SubarraySum {

    public long subarraySumOptimized(int[] A) {
        long n = A.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * (i + 1) * (n - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        SubarraySum sum = new SubarraySum();
        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};
        System.out.println(sum.subarraySumOptimized(a));
        System.out.println(sum.subarraySumOptimized(b));
    }
}
