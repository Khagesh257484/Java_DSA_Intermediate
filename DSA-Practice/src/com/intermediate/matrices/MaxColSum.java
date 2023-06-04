/*
 Question : For a given array find the max column sum
 int[][] arr={{4,6,7,2},{3,4,5,8},{0,9,6,8}};
* */

package com.intermediate.matrices;

public class MaxColSum {
    public static int maxSum(int[][] arr) {
        int row = arr.length, col = arr[0].length, max = Integer.MIN_VALUE;
        for (int j = 0; j < row; j++) {
            int sum = 0;
            for (int i = 0; j < col; j++) {
                sum += arr[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{4, 6, 7, 2}, {3, 4, 5, 8}, {0, 9, 6, 8}};
        System.out.println(maxSum(arr));

    }
}
