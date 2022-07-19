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


/*

Observation :
 A = [5, -2, 3 , 1, 2]
 B = 3

 1) We can pick last 3 and first 3 element.

 2) Or we can pick first and last 2 or we can pick first 2 and last one element.

 3) We can also apply greedy approach, but it will not work here or 2 pointer approach will also not work here

 Different Way (Intuition):
      We need different way to solve this.
      1) Find Total sum of array

      2) If I remove one element that means have to subtract one element sum from total, If we remove 2 then need to subtract 2
      element

      3) but here we want B contigous max element sum, so in this case we can subtract of (N-B) contigous min element sum
         from the total sum of array.

* */

package com.dsa.advance.array;

public class PickFromBothSide {

    public static int solve(int[] A, int B) {
        int totalSum = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            totalSum += A[i];
        }


        // first k element sum
        int k = n - B, kSum = 0;
        for (int i = 0; i < k; i++) {
            kSum += A[i];
        }

        int minSum = kSum, j = 1;
        for (int i = k; i < n; i++) {
            kSum += A[i] - A[j - 1];
            minSum = Math.min(minSum, kSum);
            j++;
        }

        return totalSum - minSum;
    }

    public static void main(String[] args) {
        int[] a = {5, -2, 3, 1, 2};
        System.out.println(solve(a, 3));
    }
}
