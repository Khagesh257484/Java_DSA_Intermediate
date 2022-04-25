package com.ggl.practice.twoDarray;

import java.util.Arrays;

public class SumOfRowsAndColumn {

    public static int[] rowSum(int[][] A) {
        int[] rowColSum = new int[A.length + A[0].length];
        int row_col_index = 0;
        int rowSum, colSum;

        // RowSum
        for (int i = 0; i < A.length; i++) {
            rowSum = 0;
            for (int j = 0; j < A[i].length; j++) {
                rowSum += A[i][j];
            }
            rowColSum[row_col_index] = rowSum;
            row_col_index++;
        }
        //System.out.print(Arrays.toString(rowArray));

        // ColSum
        for (int i = 0; i < A[0].length; i++) {
            colSum = 0;
            for (int j = 0; j < A.length; j++) {
                colSum += A[j][i];
            }
            rowColSum[row_col_index] = colSum;
            row_col_index++;
        }
        return rowColSum;
    }  // row sum method over

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {4, 5}, {6, 7}};
        int[][] b = {{96, 99}};
        int row_length = a.length;
        int col_lenth = a[0].length;
        int arraySize = row_length + col_lenth;
        //System.out.println(arraySize);
        int print[] = rowSum(b);
        System.out.println(Arrays.toString(print));
        //  colSum(a);

        // colSum

    }
}
