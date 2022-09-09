/*
Q1. Sum of all Submatrices
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.



Problem Constraints
1 <= N <=30

0 <= A[i][j] <= 10



Input Format
Single argument representing a 2-D array A of size N x N.



Output Format
Return an integer denoting the sum of all possible submatrices in the given matrix.



Example Input
A = [ [1, 1]
      [1, 1] ]


Example Output
16


Example Explanation
Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
Number of submatrices with 3 elements = 0
Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
Total Sum = 4+8+4 = 16



See Expected Output
Your input
2 3 1 2 3 4 5 6
Output
48
* */
package com.dsa.advance.array;

public class SubmatricesSum {
    // https://www.youtube.com/watch?v=trhm1IuqSdA

    public static int solve(int[][] A) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int topLeft = (i + 1) * (j + 1);
                int bottomRight = (n - i) * (n - j);

                int totalSubmatricesCount = topLeft * bottomRight;

                sum += (totalSubmatricesCount * A[i][j]);

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(solve(a));

    }
}
