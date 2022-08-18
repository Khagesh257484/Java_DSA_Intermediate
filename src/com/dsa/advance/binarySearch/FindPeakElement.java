/*
Q2. Find a peak element
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.

For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the peak element.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [5, 17, 100, 11]


Example Output
Output 1:

 5
Output 2:

 100


Example Explanation
Explanation 1:

 5 is the peak.
Explanation 2:

 100 is the peak.
* */

package com.dsa.advance.binarySearch;

public class FindPeakElement {

    // Iterative Approach
    public int solve(int[] A) {
        int s = 0, e = A.length - 1;
        int mid = 0;
        while (s <= e) {
            // finding mid by binary right shifting.
            mid = (s + e) >> 1;

            // first case if mid is the answee
            if ((mid == 0 || A[mid - 1] <= A[mid]) && (mid == A.length - 1 || A[mid + 1] <= A[mid]))
                break;

            // move the eight pointer
            if (mid > 0 && A[mid - 1] > A[mid])
                e = mid - 1;

                // move the left pointer
            else
                s = mid + 1;
        }
        return A[mid];
    }
}
