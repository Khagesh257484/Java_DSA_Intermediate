package com.dsa.intermediate.array.twoDarray;

import java.util.Arrays;

/*
Q5. Row to Column Zero

Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.

Problem Constraints
1 <= A.size() <= 103
1 <= A[i].size() <= 103
0 <= A[i][j] <= 103

Input Format
First argument is a vector of vector of integers.(2D matrix).

Output Format
Return a vector of vector after doing required operations.

Example Input
Input 1:
[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output
Output 1:
[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation
Explanation 1:
A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.

* */
public class RowToColumnZero {
    public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        boolean row = false, colum = false;

        // Step 1 : Check any 0 is present at row and column

        // Checking rows only (assume 3*4 matrices)
        for (int i = 0; i < n; i++)
            if (A[i][0] == 0)
                colum = true;

        // Checking Columns only
        for (int j = 0; j < m; j++)
            if (A[0][j] == 0)
                row = true;

        // Now checking for rest of
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++) {
                if (A[i][j] == 0) {
                    A[i][0] = 0;
                    A[0][j] = 0;
                }
            }

        // Traverse on row except 0th row
        for (int i = 1; i < n; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = 0;
                }
            }
        }

        // Traverse on column except oth col
        for (int j = 1; j < m; j++) {
            if (A[0][j] == 0) {
                for (int i = 0; i < n; i++) {
                    A[i][j] = 0;
                }
            }
        }

        // At end checking that if any row and column is zero, if yes then consider that row and column as zero
        if (row) {
            for (int j = 0; j < m; j++) {
                A[0][j] = 0;
            }
        }

        if (colum) {
            for (int i = 0; i < n; i++) {
                A[i][0] = 0;
            }
        }

        return A;
    }

    public static void main(String[] args) {

        RowToColumnZero rowToColumnZero = new RowToColumnZero();
        int[][] A = {{1, 2, 0, 4}, {5, 6, 7, 4}, {9, 2, 0, 4}};
        System.out.println(Arrays.deepToString(rowToColumnZero.solve(A)));
    }
}
