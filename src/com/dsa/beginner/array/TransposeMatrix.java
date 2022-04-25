package com.company.java.dsa.array;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] solve(int[][] A) {
        if (A.length == A[0].length) {
            int[][] b = new int[A.length][A[0].length];
            for (int c = 0; c < A[0].length; c++) {
                for (int r = 0; r < A.length; r++) {
                    b[r][c] = A[c][r];
                }
            }
            return b;
        }else{
            int [][]b=new int[A[0].length][A.length];
            for(int r=0;r<A[0].length;r++){   // In row, have to use column length cause want to run loop till column length and print column in row
                for(int c=0;c<A.length;c++){  // row wil print in column
                    b[r][c]=A[c][r];
                }
            }
            return b ;
        }
    }

    public static void main(String[] args) {

        int[][] a = {{2, 3}, {5, 4},{6,7}};
        /*
         *    2   3     Transpose of matrix :  2  5
         *    5   4                            3  4
         *
         *    Convert row int to column and column into row
         * */

        int b[][] = solve(a);
        System.out.println(Arrays.deepToString(b));

    }
}
