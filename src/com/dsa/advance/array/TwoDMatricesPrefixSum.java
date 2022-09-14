/*
 Question : Given a 2D matrix of N*M, find out prefix sum of this matrix
* */

package com.dsa.advance.array;

import java.util.Arrays;

public class TwoDMatricesPrefixSum {
    static int[][] prefixSum(int[][] a) {
        int row = a.length;
        int col = a[0].length;

        int[][] prefixSum = new int[row][col];
        prefixSum[0][0] = a[0][0];

        // Filling first row
        for (int i = 1; i < row; i++)
            prefixSum[i][0] = prefixSum[i - 1][0] + a[i][0];

        // and first column
        for (int i = 1; i < col; i++)
            prefixSum[0][i] = prefixSum[0][i - 1] + a[0][i];


        // updating the values in the
        // cells as per the general formula.
        for (int i = 1; i < row; i++)
            for (int j = 1; j < col; j++) {

                // values in the cells of new array
                // are updated
//                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1]
//                        - prefixSum[i - 1][j - 1] + a[i][j];

                // My derived formula
                prefixSum[i][j] = a[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }

        return prefixSum;
    }

    public static void main(String[] args) {
     /*   int a[][] = {{10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}};
*/
        int a[][] = {{1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};

        int[][] b={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrices : \n" + Arrays.deepToString(b));
        System.out.println("Prefix sum : \n " + Arrays.deepToString(prefixSum(b)));

    }
}
