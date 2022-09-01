/*
Q2. Rain Water Trapped
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.
* */

// Approach
/*
 How much water each building contains

* */
package com.dsa.advance.array;

public class RainWaterTraped {
    // https://www.scaler.com/academy/mentee-dashboard/class/30347/session?joinSession=1
    // https://www.youtube.com/watch?v=FbGG2qpNp4U

    public static int trap(final int[] A) {


        // Carry forward technique will help, find right and left max array
        // 7 4 5 2 6 3 : RM= 7 7 7 7 7 7 &
        //              LM = 3 6 6 6 6 7
        // Find min of left and right for each element : 3 6 6 6 6 7
        // Element height :  7 4 5 3 6 3
        //  waterContains : (min-ElementHeight) : 14

        int n = A.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // LM
        left[0] = A[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], A[i]);
        }

        // RM
        right[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], A[i]);
        }

        // Min & Water contains
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - A[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int[] A={0, 1, 0, 2};
        System.out.println(trap(A));

    }
}
