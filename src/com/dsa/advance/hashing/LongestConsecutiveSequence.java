/*
Q1. Longest Consecutive Sequence
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from array A.



Problem Constraints
1 <= N <= 106

-106 <= A[i] <= 106



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the length of the longest set of consecutive elements from the array A.



Example Input
Input 1:

A = [100, 4, 200, 1, 3, 2]
Input 2:

A = [2, 1]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].
Explanation 2:

 The set of consecutive elements will be [1, 2].
* */
package com.dsa.advance.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Approach 1 :
/*
   int[] a= {100, 4, 200, 1, 3, 2}

  1) First sort the array  : 1,2,3,4,100,200
  2) Now check if a[i]==a[i]+1 then increase length count
  3) if not equal then mark currLeng=0 and start same process again.

* */
public class LongestConsecutiveSequence {
    // My Brute Force : Getting Wrong Answer, Contact with TA
    public static int LCS_MY(int[] A) {
        int maxLeng = 0, currLeng = 1;
        Arrays.sort(A);
        for (int i = 1; i < A.length; i = i + 1) {
            if (A[i] == A[i - 1] + 1)
                currLeng++;
            else {
                currLeng = 1;
                maxLeng = Math.max(maxLeng, currLeng);
            }
        }
        return Math.max(maxLeng, currLeng);
    }


    // First Approach
    public static int LCS_First(final int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int maxLen = 0, currLen = 0;

        // 1 2 3 4 100 200
        for (int i = 0; i < n; i++) {
            if (i > 0 && A[i] == A[i - 1] + 1) {
                currLen++;
            } // Skip if the current value is equal to the previous value.
            else if (i > 0 && A[i] == A[i - 1]) {
                continue;
            }
            // Resetting count for next upcoming consecutive sequence.
            else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }

    // Second Approach : With Hashing
    public static int longestConsecutive(final List<Integer> A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int a : A) {
            hs.add(a);
        }
        int len = 0;
        for (int a : hs) {
            if (!hs.contains(a - 1)) {
                int l = 1;

                while (hs.contains(++a))
                    l++;

                len = Math.max(l, len);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(LCS_First(a));

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        System.out.println(longestConsecutive(al));

        System.out.println(LCS_MY(a));
    }
}
