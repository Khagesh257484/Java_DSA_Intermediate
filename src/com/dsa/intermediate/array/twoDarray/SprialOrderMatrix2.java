package com.dsa.intermediate.array.twoDarray;
/*

 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SprialOrderMatrix2 {

    public List<Integer> generateMatrix(int[][] A) {
        ArrayList<Integer> al = new ArrayList<>();
        int row = A.length, col = A[0].length;
        int value = 1;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;

        while (top <= bottom && left <= right) {
            // 1) Left to Right Iteration
            for (int i = left; i <= right; i++) {
                al.add(A[top][i]);
            }
            top++;

            // 2) Top to Bottom Iteration
            for (int i = top; i <= bottom; i++) {
                al.add(A[i][right]);
            }
            right--;

            // 3) Right to Left Iteration
            if (top <= bottom)
                for (int i = right; i >= left; i--) {
                    al.add(A[bottom][i]);
                }
            bottom--;

            // 4) Bottom to Top Iteration
            if (left <= right)
                for (int i = bottom; i >= top; i--) {
                    al.add(A[i][left]);
                }
            left++;
        }
        System.out.println(al.size());
        return al;
    }

    public static void main(String[] args) {
        SprialOrderMatrix2 orderMatrix = new SprialOrderMatrix2();
        int[][] a = {{1, 2, 3, 4, 19}, {5, 6, 7, 8, 20}, {9, 10, 11, 12, 21}, {13, 14, 15, 16, 22}};
        int[][] b = {{1, 2, 3, 4}};

        System.out.println(orderMatrix.generateMatrix(a));
        System.out.println(orderMatrix.generateMatrix(b));


    }
}
