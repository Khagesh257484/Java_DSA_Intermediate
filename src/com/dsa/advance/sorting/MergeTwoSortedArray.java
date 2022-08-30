/*
1. Merge Two Sorted Arrays
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.



Problem Constraints
-1010 <= A[i], B[i] <= 1010



Input Format
First Argument is a 1-D array representing A.

Second Argument is also a 1-D array representing B.



Output Format
Return a 1-D vector which you got after merging A and B.



Example Input
Input 1:

A = [4, 7, 9 ]
B = [2, 11, 19 ]
Input 2:

A = [1]
B = [2]


Example Output
Output 1:

[2, 4, 7, 9, 11, 19]
Output 2:

[1, 2]


Example Explanation
Explanation 1:

Merging A and B produces the output as described above.
Explanation 2:

 Merging A and B produces the output as described above.
* */

package com.dsa.advance.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/
public class MergeTwoSortedArray {

    // Approach
    /*
    Brute Force Approach :

1) Create a new array of size array1+array2

2) int[] a=new int[n1+n2];

3) Plugin or take all element from first array and put in array "a" & take all element from second array and put in array a

3) now after putting, you can see array is unsorted, so Sort the array

4) now put back sorted array "a" element in array 1 & array 2
    * */

    // Brute Force Approach : This method will take O(N) space complexity
    public static int[] merge_bruteForce(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[] a = new int[m + n];                // SC : O(N)
        int k = 0;  // this will take care index for new array

        for (int i = 0; i < n; i++) {   // plugin element from array A to a
            a[k++] = A[i];            // TC : O(N)
        }

        for (int i = 0; i < m; i++) {  // // plugin element from array B to a
            a[k++] = B[i];          // TC : O(N)
        }

        // Now Sorting Array
        Arrays.sort(a);               // // TC : O(NLogN)

        // Now putting back element from a to A & B
        k = 0;
        for (int i = 0; i < n; i++) {     // TC : O(N)
            A[i] = a[k++];
        }

        for (int i = 0; i < m; i++) {     // TC : O(N)
            B[i] = a[k++];
        }
        return a;
        //   return A;
        // return B;
    }


    // Solution without extra space, no need to return merge array
    /*
      int[] a = {4, 7, 9, 5};
      int[] b = {2, 11, 19};

      1) if (arr1[i] > arr2[0]) then need to swap it
      2) Suppose after swap array2 is not sorted then sort the second array
    * */

    static int[] merge_withoutExtraSpace(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int i, k;

        // Check if(A[i] >B[0]) then swap it
        for (i = 0; i < m; i++) {
            if (A[i] > B[0]) {
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;
            }

            // then sort the second array put the element in its correct position
            // so that next cycle can swap elements correctly
            // Use insertion sort
            int first = B[0];
            for (k = 1; k < m && B[k] < first; k++) {
                B[k - 1] = B[k];
            }
            B[k - 1] = first;
        }
        return A;
        // return B;
    }

    // Third Solution
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        int m = A.size(), n = B.size();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (A == null && B == null)
            return null;

        if (A == null) {
            for (int i = 0; i < n; i++)
                res.add(B.get(i));
            return res;
        }

        if (B == null) {
            for (int i = 0; i < m; i++)
                res.add(A.get(i));
            return res;
        }
        int i, j;
        int k = 0;
        for (i = 0, j = 0; k < m + n; k++) {
            if (i >= m)
                res.add(B.get(j++));
            else if (j >= n)
                res.add(A.get(i++));
            else if (A.get(i) <= B.get(j))
                res.add(A.get(i++));
            else
                res.add(B.get(j++));
        }
        return res;
    }



    public static void main(String[] args) {
        int[] a = {4, 7, 9, 5};
        int[] b = {2, 11, 19};

        System.out.println(Arrays.toString(merge_bruteForce(a, b)));

        System.out.println(Arrays.toString(merge_withoutExtraSpace(a, b)));
    }
}
