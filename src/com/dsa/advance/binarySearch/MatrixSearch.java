/*
Q1. Matrix Search
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in matrix A.

This matrix A has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom, and columns are from left to right.



Problem Constraints
1 <= N, M <= 1000
1 <= A[i][j], B <= 106



Input Format
The first argument given is the integer matrix A.
The second argument given is the integer B.



Output Format
Return 1 if B is present in A else, return 0.



Example Input
Input 1:

A = [
      [1,   3,  5,  7]
      [10, 11, 16, 20]
      [23, 30, 34, 50]
    ]
B = 3
Input 2:

A = [
      [5, 17, 100, 111]
      [119, 120, 127, 131]
    ]
B = 3


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

 3 is present in the matrix at A[0][1] position so return 1.
Explanation 2:

 3 is not present in the matrix so return 0.
* */

package com.dsa.advance.binarySearch;

import java.util.Arrays;

public class MatrixSearch {

    // My Way
    public static int searchMatrix(int[][] A, int B) {
        int m = A.length, n = A[0].length, k = 0, row = -1;
        for (int i = 0; i < m; i++) {
//            if (B < A[i][i])
//                return 0;
            if (B >= A[i][k] && B <= A[i][n - 1]) {
                row = i;
            } else if (B < A[i][i])
                return 0;
        }

        int p = 0;
        while (p < n) {
            if (A[row][p] == B) {
                return 1;
            }
            p++;

        }
        return 0;
    }

    // Binary Search Way
    public static int search2d(int[][] A, int B) {
        if (A == null || A.length == 0 || A[0].length == 0)
            return 0;

        int m = A.length, n = A[0].length;
        int start = 0, end = (m * n) - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int x = mid / n;  // x of mid
            int y = mid % n;  // y of mid

            if (A[x][y] == B)
                return 1;
            if (A[x][y] < B)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};

//        System.out.println(searchMatrix(arr, 3));
//        System.out.println(searchMatrix(arr, 1));
//        System.out.println(searchMatrix(arr, 9));

        // https://www.geeksforgeeks.org/print-2-d-array-matrix-java/
        //System.out.println(Arrays.deepToString(arr));


        // Binary Search way test cases

        System.out.println(search2d(arr, 3));
        System.out.println(search2d(arr, 1));
        System.out.println(search2d(arr, 9));

    }

}
