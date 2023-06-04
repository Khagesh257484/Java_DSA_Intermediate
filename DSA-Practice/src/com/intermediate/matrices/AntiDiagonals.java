package com.intermediate.matrices;

import java.util.Arrays;

public class AntiDiagonals {
    public static int[][] printAntiDiagonals(int[][] A) {
        int n = A.length;
        int r = 0;
        int[][] ans = new int[2 * n - 1][n];

        // First Half
        for (int i = 0; i < n; i++) {
            int x = 0, y = i;

            while (x < n && y >= 0) {
                ans[i][x] = A[x][y];
                x++;
                y--;
            }
            r = i;
        }

        // Second half
        for (int j = 1; j < n; j++) {
            r++;
            int l = 0;
            int x = j;
            int y = n - 1;

            while (x < n && y >= 0) {
                ans[r][l] = A[x][y];
                x++;
                y--;
                l++;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] arr = {{4, 6, 8, 9}, {4, 5, 7, 6}, {10, 2, 3, 4}, {6, 2, 8, 5}};
        System.out.println(Arrays.deepToString(printAntiDiagonals(arr)));
    }
}
