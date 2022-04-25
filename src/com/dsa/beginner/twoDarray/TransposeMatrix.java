package com.ggl.practice.twoDarray;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transposeMatrix(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            int[][] b = new int[2][3];
            for (int r = 0; r < b.length; r++) {
                for (int c = 0; c < b[r].length; c++) {
                    b[r][c] = matrix[c][r];
                }
            }
            return b;
        } else {
            return null;
        }
    }

    public static void printInMatrixFormat(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{4, 5}, {6, 7}, {9, 10}};

        System.out.println(matrix2[0].length);

        int[][] m1 = transposeMatrix(matrix1);
        int[][] m2 = transposeMatrix(matrix2);

        printInMatrixFormat(m1);
        System.out.println("Second Matrix...");
        printInMatrixFormat(m2);
    }
}
