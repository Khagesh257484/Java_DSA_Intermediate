package com.dsa.intermediate.array.twoDarray;
/*
Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.

Problem Constraints
1 <= A <= 1000

Input Format
First and only argument is integer A

Output Format
Return a 2-D matrix which consists of the elements in spiral order.

Example Input
Input 1:
1

Input 2:
2

Example Output

Output 1:
[ [1] ]

Output 2:
[ [1, 2], [4, 3] ]

Example Explanation

Explanation 1:
Only 1 is to be arranged.

Explanation 2:
1 --> 2
      |
      |
4<--- 3



See Expected Output
Your input
4
Output
[1 2 3 4 ] [12 13 14 5 ] [11 16 15 6 ] [10 9 8 7 ]

Observation : Check your notes.

Solution : 1) Generate the Matrix and Second Traverse this matrix in Spiral Order
* */

import java.util.ArrayList;
import java.util.Arrays;

public class SprialOrderMatrix {
    public int[][] generateMatrix(int A) {
        int[][] spiral = new int[A][A];
        int row = spiral.length, col = spiral[0].length;
        int value = 1;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;

        while (top <= bottom && left <= right) {
            // 1) Left to Right Iteration
            for (int i = left; i <= right; i++) {
                spiral[top][i] = value++;
            }
            top++;

            // 2) Top to Bottom Iteration
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = value++;
            }
            right--;

            // 3) Right to Left Iteration
            if (top <= bottom)
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = value++;
                }
            bottom--;

            // 4) Bottom to Top Iteration
            if (left <= right)
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = value++;
                }
            left++;
        }

        return spiral;
    }

    public static void main(String[] args) {
        SprialOrderMatrix orderMatrix = new SprialOrderMatrix();
        int a = 2;
        int b = 3;

        System.out.println(Arrays.deepToString(orderMatrix.generateMatrix(a)));
        //System.out.println(Arrays.deepToString(orderMatrix.generateMatrix(b)));

    }
}
