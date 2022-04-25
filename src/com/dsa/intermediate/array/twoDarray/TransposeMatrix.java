package com.dsa.intermediate.array.twoDarray;

import java.util.Arrays;
/*
Problem Description

You are given a matrix A, you have to return another matrix which is the transpose of A.
NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000

Input Format
First argument is vector of vector of integers A representing matrix.

Output Format
You have to return a vector of vector of integers after doing required operations.

Example Input
Input 1:
A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]

Input 2:
A = [[1, 2],[1, 2],[1, 2]]

Example Output
Output 1:
[[1, 4, 7], [2, 5, 8], [3, 6, 9]]

Output 2:
[[1, 1, 1], [2, 2, 2]]

Example Explanation
Explanation 1:
Cearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]] we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].

  */


public class TransposeMatrix {
    public static int[][] solve(int[][] A) {
        if (A.length == A[0].length) {
            int[][] b = new int[A.length][A[0].length];
            for (int c = 0; c < A[0].length; c++) {
                for (int r = 0; r < A.length; r++) {
                    b[r][c] = A[c][r];
                }
            }
            return b;
        } else {
            int[][] b = new int[A[0].length][A.length];
            for (int r = 0; r < A[0].length; r++) {   // In row, have to use column length cause want to run loop till column length and print column in row
                for (int c = 0; c < A.length; c++) {  // row wil print in column
                    b[r][c] = A[c][r];
                }
            }
            return b;
        }
    }

    // This code will work for both N*N and N*M matrices
    public static int[][] betterApproachForTransposeMatrix(int[][] A) {
        int[][] tx = new int[A[0].length][A.length];
        for (int i = 0; i < tx.length; i++) {
            for (int j = 0; j < tx[0].length; j++) {
                tx[i][j] = A[j][i];
            }
        }

        return tx;
    }

    // 3rd way : Transpose using Swapping , Only for N*N Matrix
    public static int[][] transposeBySwapping(int[][] A) {
        /*
          We can find out transpose matrix using swapping but has to swap only upper triangle & in this no need to create second Matrix
        * */

        // Transpose Matrix
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A[0].length; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Rotating Matrix
        for (int i = 0; i < A.length; i++) {
            int left_index = 0;
            int right_index = A.length - 1;
            while (left_index < right_index) {
                int temp = A[i][left_index];
                A[i][left_index] = A[i][right_index];
                A[i][right_index] = temp;

                left_index++;
                right_index--;
            }
        }
        return A;
    }

    public static void main(String[] args) {

        int[][] a = {{2, 3}, {5, 4}};
        /*
         *    2   3     Transpose of matrix :  2  5
         *    5   4                            3  4
         *
         *    Convert row int to column and column into row
         * */

        int b[][] = solve(a);
        //System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(transposeBySwapping(b)));

    }
}
