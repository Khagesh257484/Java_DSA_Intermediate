/*
Q3. Leaders in an array
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.

Problem Constraints

1 <= N <= 105
1 <= A[i] <= 108
Input Format

There is a single input argument which a integer array A
Output Format

Return an integer array denoting all the **leader elements** of the array.
NOTE: Ordering in the output doesn't matter.

Example Input

 A = [16, 17, 4, 3, 5, 2]
Example Output

 [17, 2, 5]
Example Explanation

 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return this three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
* */

package com.intermediate.array;

public class LeadersInArray {
    public static int solve_naive(int[] arr) {
        int leaderCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max)
                    max = arr[j];
            }
            if (arr[i] > max)
                leaderCount++;
        }
        return leaderCount;
    }

    public static int solve_optimized(int[] arr) {
        int leaderCount = 0, max = Integer.MIN_VALUE, n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                leaderCount++;
                max = arr[i];
            }
        }
        return leaderCount;
    }

    public static void main(String[] args) {
        int[] arr = {15, -1, 7, 2, 5, 4, 2, 3};
        System.out.println(solve_naive(arr));

        int[] arr1 = {10, 8, 2, 8, 4, 6, 3, 7};
        System.out.println(solve_naive(arr1));

        System.out.println("Optimized Solution output");

        System.out.println(solve_optimized(arr));
        System.out.println(solve_optimized(arr1));
    }
}
