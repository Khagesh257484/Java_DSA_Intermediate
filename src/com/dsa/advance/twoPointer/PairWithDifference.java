package com.dsa.advance.twoPointer;

import java.util.Arrays;

public class PairWithDifference {
    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int i = 0, j = 1, n = A.length, count = 0;
        while (j < n) {
            if (A[j] - A[i] == B) {

               /*
               if We only do j++ then it will not work , 1 1 1 2 2 3 4  & target is 1
               there will be 2 pair of 2 & 1, one pair of 3&2 and another pair of 3 & 4
               j++;
               */
               // count++;

                // Logic to handle distinct pairt
                int j1 = j;
                int i1 = i;
                while (i1 < n && A[i1] == A[i]) i1++;
                while (j1 < n && A[j1] == A[j]) j1++;
                j = j1;
                i = i1;

                // Logic to handle duplicate pair
//                int j1 = j;
//                int i1 = i;
//                while (i1 < n && A[i1] == A[i]) i1++;
//                while (j1 < n && A[j1] == A[j]) j1++;
//                count += i1 * j1;
//                j = j1;
//                i = i1;

            } else if (A[j] - A[i] > B) {
                i++;
                if (i == j)
                    j = j + 1;
            } else
                j++;
        }
        return count;
    }

    // for duplicate array
    static int BS(int[] arr, int X, int low) {
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= X) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    static int countPairsWithDiffK(int[] arr, int N, int k) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < N; ++i) {
            int X = BS(arr, arr[i] + k, i + 1);
            if (X != N) {
                int Y = BS(arr, arr[i] + k + 1, i + 1);
                count += Y - X;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
        System.out.println(solve(a, 3));

        int[] b = {1, 1, 1, 2, 2, 2, 3, 4};
        System.out.println(solve(b, 1));
        //  System.out.println(countPairsWithDiffK(a, a.length, 3));
    }
}
