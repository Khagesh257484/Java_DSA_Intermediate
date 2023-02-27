/*
Q3. Matrix Transpose
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.


Problem Constraints

1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000



Input Format

First argument is a 2D matrix of integers.



Output Format

You have to return the Transpose of this 2D matrix.



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

Cearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
* */

package com.beginner.matrix;

import java.util.Arrays;

public class TransposeMatrix {
    static int[][] transposeMatrix(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = A[j][i];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int[][] A = {{0, 1, 2}, {3, 4, 5}};
        int[][] transpose = transposeMatrix(A);
        System.out.println(Arrays.deepToString(transpose));

        int[][] B = {{0, 1, 2}, {3, 4, 5},{6,7,8}};
        int[][] transpose1 = transposeMatrix(B);
        System.out.println(Arrays.deepToString(transpose1));
    }
}
