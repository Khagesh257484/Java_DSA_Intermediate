package com.dsa.intermediate.array.twoDarray;
/*
Problem Description

You are given two integer matrices A(having M X N size) and B(having N X P). You have to multiply matrix A with B and return the resultant matrix. (i.e. return the matrix AB).

Problem Constraints :
1 <= M, N, P <= 100
-100 <= A[i][j], B[i][j] <= 100


Input Format :
First argument is a 2D integer matrix A.
Second argument is a 2D integer matrix B.

Output Format :
Return a 2D integer matrix denoting AB.

Example  :

Input 1:
 A = [[1, 2],            B = [[5, 6],
      [3, 4]]                 [7, 8]]

Input 2:
 A = [[1, 1]]            B = [[2],
                              [3]]


Example Output :

Output 1:
 [[19, 22],
  [43, 50]]

Output 2:
 [[5]]

Example Explanation :

Explanation 1:
 [[1, 1]].[[2, 3]] = [[1 * 2 + 1 * 3]] = [[5]]

* */


import java.util.Arrays;

public class MultiplicationMatrix {
    public int[][] solve(int[][] A, int[][] B) {
        int row1 = A.length;
        int col1 = A[0].length;
        int row2 = B.length;
        int col2 = A[0].length;

        int C[][] = new int[row1][col2];

        if (row2 != col1) {
            System.out.println("Multiplication Not Possible");
            return null;
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        return C;
    }

    public static void main(String[] args) {
        MultiplicationMatrix multiplicationMatrix = new MultiplicationMatrix();
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println(Arrays.deepToString(multiplicationMatrix.solve(a, b)));
    }
}