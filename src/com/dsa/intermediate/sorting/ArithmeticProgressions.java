package com.dsa.intermediate.sorting;

import java.util.Arrays;

/*
Q3. Arithmetic Progression?
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved..
Get help from TA.
Problem Description
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.



Problem Constraints
2 <= N <= 105

-109 <= A[i] <= 109



Input Format
The first and only argument is an integer array A of size N.



Output Format
Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.



Example Input
Input 1:

 A = [3, 5, 1]
Input 2:

 A = [2, 4, 1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
Explanation 2:

 There is no way to reorder the elements to obtain an arithmetic progression.

* */

public class ArithmeticProgressions {
    public int solve(int[] A) {
        // Sort Array in Ascending Order
        // Find difference of first 2 elements
        // Then check difference of each element is equal to found difference or not.
        Arrays.sort(A);
        int diff = A[0] - A[1];
        for (int i = 2; i < A.length; i++) {
            if ((A[i - 1] - A[i] != diff))
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        ArithmeticProgressions progressions = new ArithmeticProgressions();
        int[] A = {3, 5, 1};
        int[] B = {2, 5, 1};
        System.out.println(progressions.solve(A));
        System.out.println(progressions.solve(B));
    }
}
