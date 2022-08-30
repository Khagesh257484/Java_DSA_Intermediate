/*
Q4. Spiral Order Matrix II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.



Problem Constraints
1 <= A <= 1000



Input Format
First and only argument is integer A


Output Format
Return a 2-D matrix which consists of the elements added in spiral order.



Example Input
Input 1:

1
Input 2:

2
Input 3:

5


Example Output
Output 1:

[ [1] ]
Output 2:

[ [1, 2], [4, 3] ]
Output 2:

[ [1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9] ]


Example Explanation
Explanation 1:

Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3
Explanation 3:


* */
package com.dsa.advance.array;

public class SprialOrderMatrixAd {
    public static int[][] generateMatrix(int A) {
        int[][] sprial = new int[A][A];
        int row = sprial.length, col = sprial[0].length;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;
        int value = 1;

        // Four steps need to perform for this, one for top row, second for last col, third for last row & fourth
        // would be for first colum, same process will run until all cell does not fill.

        // First row or top row or left to right iteration
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                sprial[top][i] = value++;
            }
            top++;

            // top to bottom iteration (last colum iteration)
            for (int i = top; i <= bottom; i++) {
                sprial[i][right] = value++;
            }
            right--;

            // 3) Right to Left Iteration
            if (top <= bottom)
                for (int i = right; i >= left; i--) {
                    sprial[bottom][i] = value++;
                }
            bottom--;

            // 4) Bottom to Top Iteration
            if (left <= right)
                for (int i = bottom; i >= top; i--) {
                    sprial[i][left] = value++;
                }
            left++;
        }
        return sprial;
    }

    public static void main(String[] args) {

    }

}
