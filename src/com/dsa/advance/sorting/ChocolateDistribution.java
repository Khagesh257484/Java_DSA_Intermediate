/*
Q1. Chocolate Distribution
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of N integers where the i-th element represent the number of chocolates in the i-th packet.

There are B number of students, the task is to distribute chocolate packets following below conditions:

1. Each student gets one packet.
2. The difference between the number of chocolates given to any two students is minimum.
Return the minimum difference (that can be achieved) between the student who gets minimum number of chocolates and the student who gets maximum number of chocolates.



Problem Constraints
0 <= N <= 10^5
1 <= A[i] <= 10^7
0 <= B <= 10^5


Input Format
The first argument contains an integer array A.

The second argument contains an integer B.



Output Format
Return the minimum difference (that can be achieved) between maximum and minimum number of chocolates distributed.


Example Input
Input:

  A : [3, 4, 1, 9, 56, 7, 9, 12]
  B : 5


Example Output
Output:

  6


Example Explanation
Explanation:


  We can choose the packets with chocolates = [3, 4, 9, 7, 9]
  The difference between maximum and minimum is 9-3 = 6
* */

// Approach :

/*
 5 students mai chocolate iss tarike se distribute krna hai ki jiss student ko minimun number of chocolate mili ho or jiss student ko maximum number of chocolate mili ho uss k bich ka distance kam kiya jaa skte

 Need to distribute chocolate in 5 students like that difference should be minimun between student get max number of chocolate and a student get min number of chocolate.

 chocolate can distribute dynamically, you can distribute index 0 2 4 5  or 1 3 5 7 like that.
 So in unsorted array doing this type of operation is difficult.
 We can do it using 2 for loop but time complexity will be O(N^2)

 Approach :

 1) Frist sort the array

 2) Find the Min and Max in Given Interbal B ( first value will be minimun and (B-1)th value will be Maximum)

 3) Now use 2 pointer in window of 5 size.
* */

// Approach
/*
 5 students mai chocolate iss tarike se distribute krna hai ki jiss student ko minimun number of chocolate mili ho or jiss student ko maximum number of chocolate mili ho uss k bich ka distance kam kiya jaa skte

 Need to distribute chocolate in 5 students like that difference should be minimun between student get max number of chocolate and a student get min number of chocolate.

 chocolate can distribute dynamically, you can distribute index 0 2 4 5  or 1 3 5 7 like that.
 So in unsorted array doing this type of operation is difficult.
 We can do it using 2 for loop but time complexity will be O(N^2)

 Approach :

 1) Frist sort the array

 2) Find the Min and Max in Given Interbal B ( first value will be minimun and (B-1)th value will be Maximum)

 3) Now use 2 pointer in window of 5 size. in each window check minimun gap
* */

package com.dsa.advance.sorting;
// https://www.youtube.com/watch?v=50nn3bA1BT4

import java.util.Arrays;

public class ChocolateDistribution {
    public static int solve(int[] A, int B) {
        if (B == 0 || A.length == 0)
            return 0;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        for (int i = 0; i <= A.length - B; i++) {
            int min = A[i];
            int max = A[i + B - 1];
            int gap = max - min;

            if (gap < ans) {
                ans = gap;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(solve(a, 5));
    }
}
