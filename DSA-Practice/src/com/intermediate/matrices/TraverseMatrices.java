/*
 Question : Given a matrices, traverse the matrices

 int[][[ arr ={{1,2,3},{5,6,7},{,4,8,9}}
* */

package com.intermediate.matrices;

public class TraverseMatrices {
    public static void traverseMatrices_row_wise(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void traverseMatrices_col_wise(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {5, 6, 7}, {4, 8, 9}};
        traverseMatrices_row_wise(arr);
        System.out.println();
        traverseMatrices_col_wise(arr);
    }
}
