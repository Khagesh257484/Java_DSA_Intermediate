/*
Q2. Row & Column Sums
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.

NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.


Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000



Input Format
First argument is a 2D matrix of integers.



Output Format
You have to return a 1D list of integers after doing required operations.



Example Input
Input 1:

A = [[1, 2],[4, 5],[8, 9]]


Example Output
Output 1:

[3, 9, 17, 13, 16]


Example Explanation
Explanation 1:

Row 1 elements sum = 1 + 2 = 3.
Row 2 elements sum = 4 + 5 = 9.
Row 3 elements sum = 8 + 9 = 17.
Column 1 elements sum = 1 + 4 + 8 = 13.
Column 2 elements sum = 2 + 5 + 9 = 16.
* */
package com.beginner.matrix;

import java.util.Arrays;

public class RowColSum {
    static int[] rowColSum(int[][] A) {
        int[] result = new int[A.length + A[0].length];
        int index = 0;

        // Rows Sum
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[0].length; j++) {
                sum = sum + A[i][j];
            }
            result[index] = sum;
            index++;
        }
        // Col Sum
        for (int i = 0; i < A[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum = sum + A[j][i];
            }
            result[index] = sum;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {4, 5}, {8, 9}};
        System.out.println(Arrays.toString(rowColSum(A)));
    }
}
