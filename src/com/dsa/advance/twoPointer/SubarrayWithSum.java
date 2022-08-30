/*
Q1. Subarray with given sum
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation
Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.



See Expected Output
Your input
5 1 2 3 4 5 1
Output
1

* */

package com.dsa.advance.twoPointer;


import java.util.Arrays;

public class SubarrayWithSum {

    public static int[] subarraySumBruteForce(int[] arr, int k) {
        int len = arr.length;
        int sum, start, end;

        //Outer loop starts from zero
        for (int i = 0; i < len; i++) {
            //Assign the value present at ith index
            sum = arr[i];

            //Inner loops starts from i+1
            for (int j = i + 1; j <= len; j++) {

                //If sum is equal to k, return indexes
                if (sum == k) {
                    start = i;
                    end = j - 1;
                    int[] ans = new int[end - start + 1];

                    return new int[]{i, j - 1};
                }

                //If it is greater, break the loop
                if (sum > k)
                    break;

                if (j < len)
                    sum = sum + arr[j];
            }
        }

        return new int[]{-1};
    }

    // Showing sub array index from where to where sum exist
    public static int[] solve(int[] A, int B) {
        int i = 0;
        int j = 1;

        //In sum variable, Assign the value present at 0th index
        int sum = A[0];
        int len = A.length;

        while (j <= len) {

            while (sum > B && i < j - 1) {
                sum = sum - A[i];
                i++;
            }

            if (sum == B) {
                return new int[]{i, j - 1};
            }

            if (j < len)
                sum = sum + A[j];

            j++;

        }

        return new int[]{-1};
    }

    public static int[] solve2(int[] A, int B) {
        int i = 0, j = 0;
        int sum = A[0], n = A.length;
        while (j < n) {
            if (sum == B) {
                int[] ans = new int[j - i + 1];
                for (int index = i; index <= j; index++) {
                    ans[index - i] = A[index];
                }
                return ans;
            } else if (sum < B) {
                j++;
                if (j < n)
                    sum += A[j];
            } else {
                sum -= A[i];
                i++;
                if (i > j && i < n - 1) {
                    j++;
                    sum += A[j];
                }
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve2(A, 5)));
        System.out.println(Arrays.toString(solve2(A, 1)));
        System.out.println(Arrays.toString(solve2(A, 6)));        ;
        System.out.println(Arrays.toString(solve2(A, 38)));

    }
}
