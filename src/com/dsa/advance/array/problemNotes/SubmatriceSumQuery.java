/*
Q2. Sub-matrix Sum Queries
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
Sum may be large, so return the answer mod 109 + 7.


Problem Constraints
1 <= N, M <= 1000
-100000 <= A[i] <= 100000
1 <= Q <= 100000
1 <= B[i] <= D[i] <= N
1 <= C[i] <= E[i] <= M



Input Format
The first argument given is the integer matrix A.
The second argument given is the integer array B.
The third argument given is the integer array C.
The fourth argument given is the integer array D.
The fifth argument given is the integer array E.
(B[i], C[i]) represents the top left corner of the i'th query.
(D[i], E[i]) represents the bottom right corner of the i'th query.



Output Format
Return an integer array containing the submatrix sum for each query.



Example Input
Input 1:

 A = [   [1, 2, 3]
         [4, 5, 6]
         [7, 8, 9]   ]
 B = [1, 2]
 C = [1, 2]
 D = [2, 3]
 E = [2, 3]
Input 2:

 A = [   [5, 17, 100, 11]
         [0, 0,  2,   8]    ]
 B = [1, 1]
 C = [1, 4]
 D = [2, 2]
 E = [2, 4]


Example Output
Output 1:

 [12, 28]
Output 2:

 [22, 19]


Example Explanation
Explanation 1:

 For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
 For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.
Explanation 2:

 For query 1: Submatrix contains elements: 5, 17, 0 and 0. So, their sum is 22.
 For query 2: Submatrix contains elements: 11 and 8. So, their sum is 19.
* */
package com.dsa.advance.array.problemNotes;

import java.util.Arrays;

public class SubmatriceSumQuery {
    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int row = A.length, col = A[0].length;
        long mod = 1000000007;  // 8 tailing zeroes

        long[][] prefixSum = new long[row][col];

        prefixSum[0][0] = A[0][0];

        // Filling first row
        for (int i = 1; i <row; i++)
            prefixSum[i][0] = prefixSum[i - 1][0] + A[i][0];
        // and first column
        for (int i = 1; i < col; i++)
            prefixSum[0][i] = prefixSum[0][i - 1] + A[0][i];

        //
        for (int i = 1; i < row; i++)
            for (int j = 1; j < col; j++) {
                prefixSum[i][j] = A[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }


       System.out.println(Arrays.deepToString(prefixSum));

        //
        int k = B.length;
        int[] ans = new int[k];

        for (int x = 0; x < k; x++) {  // if i<=k the no need to do -1
            long sum = prefixSum[D[x] - 1][E[x] - 1]; // -1 cause 1 base index, finding sum till bottom right

            if (C[x] - 2 >= 0) {   // -2 : -1 for one base index and second -1 is for if matrix sum start from top row, so if you do -1 then it will go in negative which is not possible index.
                sum = (sum - prefixSum[D[x] - 1][C[x] - 2]) % mod;
                //
            }
            if (B[x] - 2 >= 0) {
                sum = (sum - prefixSum[B[x] - 2][E[x] - 1]) % mod;
                //
            }
            if (C[x] - 2 >= 0 && B[x] - 2 >= 0) {
                sum = (sum + prefixSum[B[x] - 2][C[x] - 2]) % mod;
                //
            }
            ans[x] = (int) ((sum + mod) % mod);
            // Adding mod in sum because it can have negative value so to make it positive

        }
        return ans;

    }

    // Second way
    public int[] solve2(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int n = A.length, m = A[0].length, MOD = 1000000007;
        int sum = 0;
        long[][] preSum = new long[n + 1][m + 1];

        //In 0 based we need to initialise 0 rows and 0 columns

        //Calculating Prefix Sum 1 Based
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                preSum[i][j] = (preSum[i][j - 1] + preSum[i - 1][j] - preSum[i - 1][j - 1] + A[i - 1][j - 1] + MOD) % MOD;
            }
        }

        int[] res = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            int r1 = B[i];
            int c1 = C[i];
            int r2 = D[i];
            int c2 = E[i];

            long ans = preSum[r2][c2] - preSum[r2][c1 - 1] - preSum[r1 - 1][c2] + preSum[r1 - 1][c1 - 1] + 2 * MOD;

            ans = ans % MOD;

            res[i] = (int) ans;
            //res.Add((int)ans);

        }

        return res;
    }

    // Scaler Solution
    public int[] solve3(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int n = A.length, m = A[0].length, mod = 1000000007;
        int sum = 0;
        long preSum[][] = new long[n + 1][m + 1];
        //preSum[i][j] denotes the sum of elements of matirx (0, 0) to (i, j)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                preSum[i][j] = (A[i - 1][j - 1] + preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1] + mod) % mod;
            }
        }
        int res[] = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int x1 = B[i], y1 = C[i], x2 = D[i], y2 = E[i];
            long ans = preSum[x2][y2] - preSum[x2][y1 - 1] - preSum[x1 - 1][y2] + preSum[x1 - 1][y1 - 1];
            while (ans < 0)
                ans += mod;
            ans = ans % mod;
            res[i] = (int) ans;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] B = {1, 2};
        int[] C = {1, 2};
        int[] D = {2, 3};
        int[] E = {2, 3};

        System.out.println(Arrays.toString(solve(A, B, C, D, E)));

    }
}
