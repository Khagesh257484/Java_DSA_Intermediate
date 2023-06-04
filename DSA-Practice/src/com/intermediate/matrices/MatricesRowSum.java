/*
 For a given matrices, find the row wise sum

 in[][] arr={{4,6,7,2},{3,4,5,8},{0,9,6,8}}
* */

package com.intermediate.matrices;

public class MatricesRowSum {
    public static void rowWiseSum(int[][] arr) {
        int col = arr[0].length, row = arr.length;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum+"\t");
        }
    }

    public static void main(String[] args) {
        int[][] arr={{4,6,7,2},{3,4,5,8},{0,9,6,8}};
        rowWiseSum(arr);
    }
}
