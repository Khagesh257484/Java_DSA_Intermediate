/*
Q1. Sorted Insert Position
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
If not, return the index where it would be if it were inserted in order.

NOTE: You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= N <= 106



Input Format
The first argument is an integer array A of size N.
The second argument is an integer B.



Output Format
Return an integer denoting the index of target value.



Example Input
Input 1:

A = [1, 3, 5, 6]
B = 5
Input 2:

A = [1]
B = 1


Example Output
Output 1:

2
Output 2:

0


Example Explanation
Explanation 1:

The target value is present at index 2.
Explanation 2:

The target value is present at index 0.



See Expected Output
Your input
3 1 4 5 2
Output
1
* */

// Approach & Observation
/*
 Approach 1 : First we can do linear search, it will take O(N) time and O(1) auxiliary space.

 Approach 2 : We can also do it by using HashMap but it will take O(N) time and O(N) space.

 Approach 3 : We can solve this using binary search in O(logn) time whihc required in question.
* */
package com.dsa.advance.binarySearch;

public class SortedInsertPosition {
    public static int searchInsert(int[] A, int B) {
        if (A.length == 0)
            return 1;

        int s = 0, e = A.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (A[mid] == B)
                return mid;
            else if (B > A[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        if (B > s)
            return s ;
        else
            return e + 1;

        //System.out.println("start  : " + s + " :::: " + " end : " + e);

        // This return -1 concept use if element not found then simply return -1
        //== return -1;
    }

    public static void main(String[] args) {
        // First test case : If element is present
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(searchInsert(a, 5));
        System.out.println(searchInsert(a, 2));

        // Second test case : If element is not present then where it should be present.
        int[] b = {1, 4, 7, 10, 11, 15, 18};
        System.out.println(searchInsert(b, 3));
        System.out.println(searchInsert(b, 2));
        System.out.println(searchInsert(b, 16));
        System.out.println(searchInsert(b, 14));

        // Third test case
        int[] c={1,4,5};
        System.out.println(searchInsert(c,2));

    }
}
