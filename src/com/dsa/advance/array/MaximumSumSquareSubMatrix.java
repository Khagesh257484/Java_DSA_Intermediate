/*
Q3. Maximum Sum Square SubMatrix
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, such that the sum of all the elements in the submatrix is maximum.



Problem Constraints
1 <= N <= 103.

1 <= B <= N

-102 <= A[i][j] <= 102.



Input Format
First arguement is an 2D integer matrix A.

Second argument is an integer B.



Output Format
Return a single integer denoting the maximum sum of submatrix of size B x B.



Example Input
Input 1:

 A = [
        [1, 1, 1, 1, 1]
        [2, 2, 2, 2, 2]
        [3, 8, 6, 7, 3]
        [4, 4, 4, 4, 4]
        [5, 5, 5, 5, 5]
     ]
 B = 3
Input 2:

 A = [
        [2, 2]
        [2, 2]
    ]
 B = 2


Example Output
Output 1:

 48
Output 2:

 8


Example Explanation
Explanation 1:

    Maximum sum 3 x 3 matrix is
    8 6 7
    4 4 4
    5 5 5
    Sum = 48
Explanation 2:

 Maximum sum 2 x 2 matrix is
  2 2
  2 2
  Sum = 8
* */
package com.dsa.advance.array;
/*
 Idea : To calculate the sum of square matrix we need to find all square matrices sum and return max.
        To find the sum of all matrices we need to find the prefix sum of matrix.
       condition : If you're finding 2*2 matrices then you can observe that from last row and column you can't generate the sub matrices so handle this
        case as well in code. for same as 3*3 can't generate any square matrix from last 2 rows and column.

 Algo  : 1) Find prefix sum of matrix
         2) Find max sum matrix

* */

public class MaximumSumSquareSubMatrix {
    // Brute Force : TC -> n4
    // this commented section will not work for all value
   /* public static int solve_naive(int[][] A, int B) {
        int row = A.length, col = A[0].length;
        int maxSum = Integer.MIN_VALUE;

        // k=3 , 3*3
        // Iterate over row and column
        for (int i = 0; i < row; i++) {
            for (int j = 0; i < col; j++) {
                // if square matrix is possible : condition
                if (i + B <= row && j + B <= col) {
                    int sum = 0;
                    // again iterate row and col wise to find out sub matrices
                    for (int k = i; k < i + B; k++) {
                        for (int l = j; l < j + B; l++) {
                            // 3*3 = 9 elements, then find sum of 9 elements
                            sum = sum + A[k][l];
                        }
                    }
                    maxSum = Math.max(sum, maxSum);
                }
            }
        }
        return maxSum;
    }

    public static int solve_optimized(int[][] A, int B) {
        int row = A.length, col = A[0].length;
        int maxSum=Integer.MIN_VALUE;

        // First find prefix sum
        //int[][] preSum = prefixSum(A, row, col);
        int[][] preSum = prefixSum2(A, row, col);
        for(int i=0;i<preSum.length;i++){
            for(int j=0;j<preSum[0].length;j++){
                // 3*3
                int sum=0;
                if(i-B+1>=0 && j-B+1>=0){
                    sum+=preSum[i][j]-preSum[i-B][j]-preSum[i][j-B]+preSum[i-B][j-B];
                }

            }
        }
        return 0;
    }

    public static int[][] prefixSum2(int[][] A, int row, int col) {
        int[][] prefSum = new int[row + 1][col + 1];
        for (int i = 0; i < prefSum.length; i++) {
            for (int j = 0; j < prefSum[0].length; j++) {
                prefSum[i][j] = A[i - 1][j - 1] + prefSum[i - 1][j] + prefSum[i][j - 1] - prefSum[i - 1][j - 1];
            }
        }
        return prefSum;
    }

    public static int[][] prefixSum(int[][] a, int row, int col) {
        int[][] prefixSum = new int[row][col];
        prefixSum[0][0] = a[0][0];

        for (int i = 1; i < row; i++)
            prefixSum[i][0] = prefixSum[i - 1][0] + a[i][0];

        for (int i = 1; i < col; i++)
            prefixSum[0][i] = prefixSum[0][i - 1] + a[0][i];

        for (int i = 1; i < row; i++)
            for (int j = 1; j < col; j++) {
                prefixSum[i][j] = a[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        return prefixSum;
    }*/

    public static int solve(int[][] A, int B) {
        int[][] preSum = getPrefSum(A, A.length, A[0].length);
        int row = preSum.length, col = preSum[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0;
                if (i - B + 1 >= 0 && j - B + 1 >= 0) {
                    int x = i - B + 1, y = j - B + 1;
                    sum = preSum[i][j];
                    if (x - 1 >= 0) {
                        sum -= preSum[x - 1][j];
                    }
                    if (y - 1 >= 0) {
                        sum -= preSum[i][y - 1];
                    }
                    if (x - 1 >= 0 && y - 1 >= 0) {
                        sum += preSum[x - 1][y - 1];
                    }
                    maxSum = Math.max(sum, maxSum);

                }
            }
        }

        return maxSum;

    }

    public static int[][] getPrefSum(int[][] a, int row, int col) {

        int[][] prefixSum = new int[row][col];
        prefixSum[0][0] = a[0][0];

        // Filling first row
        for (int i = 1; i < row; i++)
            prefixSum[i][0] = prefixSum[i - 1][0] + a[i][0];

        // and first column
        for (int i = 1; i < col; i++)
            prefixSum[0][i] = prefixSum[0][i - 1] + a[0][i];

        for (int i = 1; i < row; i++)
            for (int j = 1; j < col; j++) {
                prefixSum[i][j] = a[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }

        return prefixSum;

    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 8, 6, 7, 3},
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5}
        };
        System.out.println(solve(A, 3));
    }
}
