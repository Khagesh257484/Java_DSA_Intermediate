package com.dsa.intermediate.array.subarrays;

import java.util.Arrays;

/*
Question : Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum. But the sum must not exceed B.


Problem Constraints
1 <= A <= 103
1 <= B <= 109
1 <= C[i] <= 106


Input Format
The first argument is the integer A.
The second argument is the integer B.
The third argument is the integer array C.

Output Format
Return a single integer which denotes the maximum sum.

Example Input
Input 1:
A = 5
B = 12
C = [2, 1, 3, 4, 5]

Input 2:
A = 3
B = 1
C = [2, 2, 2]

Example Output
Output 1:
12

Output 2:
0

Example Explanation

Explanation 1:
We can select {3,4,5} which sums up to 12 which is the maximum possible sum.

Explanation 2:
All elements are greater than B, which means we cannot select any subarray.
Hence, the answer is 0.

* */
public class MaximumSubarray {
    public int[] prefix_sum(int[] a) {
        int[] ps = new int[a.length];
        for (int i = 0; i < a.length; i++) {
           /* if (i == 0)
                ps[i] = a[i];
            else
                ps[i] = ps[i - 1] + a[i];*/

            ps[i] = (i == 0 ? a[i] : ps[i - 1] + a[i]);   // ternory operator
        }
        return ps;
    }

    public int maxSubarray(int A, int B, int[] C) {
        int[] prefixSum = prefix_sum(C);
        int ans = 0;

        for (int s = 0; s < A; s++) {
            int sum = 0;
            for (int e = s; e < A; e++) {
                sum = (s == 0 ? prefixSum[e] : prefixSum[e] - prefixSum[s - 1]);
                if (sum <= B)
                    ans = Math.max(sum, ans);
            }

        }
        return ans;
    }


    public static void main(String[] args) {

        MaximumSubarray ms = new MaximumSubarray();
        /*int[] a = {2, 1, 3, 4, 5};
        System.out.println(ms.maxSubarray(5, 12, a)); */

        int[] b = {4};
        System.out.println(ms.maxSubarray(1, 12, b));


       /* int[] c={2,2,2};
        System.out.println(ms.maxSubarray(3,1,c));*/

        int[] d = {1, 2, 4, 4, 5, 5, 5, 7, 5};
        System.out.println(ms.maxSubarray(9, 14, d));
    }
}
