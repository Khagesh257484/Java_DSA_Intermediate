/*
Q3. Column Sum
Solved
Hint bulb icon
Stuck somewhere?
Using hints is now penalty free
Check Now
Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument is a 2D array of integers.(2D matrix).



Output Format
Return an array conatining column-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

{15,10,13,16}


Example Explanation
Explanation 1

Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16
**/

package com.intermediate.matrices;

import java.util.Arrays;

public class ColumnSum {

    public static int[] columnSum(int[][] A) {
        int row = A.length, col = A[0].length;
        int[] result = new int[col];

        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += A[i][j];
            }
            result[j] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        System.out.println(Arrays.toString(columnSum(A)));

    }

}
