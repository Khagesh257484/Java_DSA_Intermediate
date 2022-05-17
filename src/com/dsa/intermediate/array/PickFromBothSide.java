package com.dsa.intermediate.array;
/*
Q3. Pick from both sides!
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4, and array A contains 10 elements, then

You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.


Problem Constraints
1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the maximum possible sum of elements you picked.



Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1


Example Output
Output 1:

 8
Output 2:

 2


Example Explanation
Explanation 1:

 Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2:

 Pick element 2 from end as this is the maximum we can get
* */

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSide {
    public int solve_Array(int[] A, int B) {
        int max = Integer.MIN_VALUE, sum = 0;

        // First B element sum
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        max = Integer.max(sum, max);   // Find max between first element sum and sum

        // Last B Element sum
        int n = A.length;
        sum = 0;   // updating sum again because need to calculate again
        for (int i = n - B; i < n; i++) {
            sum += A[i];
        }
        max = Integer.max(sum, max);


        //

        return max;
    }

    public int solve_arrayList(ArrayList<Integer> A, int B) {
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum = sum + A.get(i);
        }
        int last = A.size() - 1;
        int maxsum = sum;
        while (B > 0 && last > 0) {
            sum = sum - A.get(B - 1) + A.get(last);
            maxsum = Math.max(maxsum, sum);
            B--;
            last--;
        }
        // System.out.println(maxsum);
        return maxsum;

    }

    public static void main(String[] args) {
        PickFromBothSide pick = new PickFromBothSide();
        int[] a = {5, -2, 3, 1, 2};
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(5, -2, 3, 1, 2));
        System.out.println(pick.solve_arrayList(al, 4));

    }
}
