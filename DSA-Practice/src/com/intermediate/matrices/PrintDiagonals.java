/*
 Question : Print Left and Right Diagonals of the given matrices

 int[][] arr = {{4, 6, 7}, {3, 4, 5}, {9, 2, 8}};
* */

package com.intermediate.matrices;

public class PrintDiagonals {
    public static void leftDiagonals(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        if (m != n) {
            System.out.println("Row and Column should be same, please enter same row and column value to find the diagonals.......");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i][i] + "\t");
        }
    }

    public static void rightDiagonals(int[][] arr) {
        int m = arr.length, n = arr[0].length, i = 0, j = m - 1;
        if (m != n) {
            System.out.println("Row and Column should be same, please enter same row and column value to find the diagonals.......");
            return;
        }

        while (i < m && j >= 0) {
            System.out.print(arr[i][j] + "\t");
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{4, 6, 7}, {3, 4, 5}, {9, 2, 8}};

        leftDiagonals(arr);
        System.out.println();
        rightDiagonals(arr);

    }
}
