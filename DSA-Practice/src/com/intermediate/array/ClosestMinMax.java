/*
Q2. Closest MinMax
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.
* */

package com.intermediate.array;

public class ClosestMinMax {
    public static int solve_bruteForce(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == max)
                    ans = Math.min(ans, (j - 1 + 1));
                else if (arr[j] == min) {
                    ans = Math.min(ans, (j - 1 + 1));
                }
            }

        }
        return ans;
    }

    public static int solve_optimized(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        int ans = Integer.MAX_VALUE;
        int pos_max = -1, pos_min = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                pos_max = i;
            if (arr[i] == min)
                pos_min = i;

            if (pos_max != -1 && pos_min != -1)
                ans = Math.min(ans, Math.abs(pos_max - pos_min + 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        System.out.println(solve_bruteForce(arr));
        System.out.println(solve_optimized(arr));
    }
}
