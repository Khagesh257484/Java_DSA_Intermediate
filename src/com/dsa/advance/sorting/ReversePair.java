/*
Q2. Reverse pairs
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, we call (i, j) an important reverse pair if i < j and A[i] > 2*A[j].
Return the number of important reverse pairs in the given array A.



Problem Constraints
1 <= length of the array <= 105

-2 * 109 <= A[i] <= 2 * 109



Input Format
The only argument given is the integer array A.



Output Format
Return the number of important reverse pairs in the given array A.



Example Input
Input 1:

 A = [1, 3, 2, 3, 1]
Input 2:

 A = [4, 1, 2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 There are two pairs which are important reverse i.e (3, 1) and (3, 1).
Explanation 2:

 There is only one pair i.e (4, 1).



See Expected Output
Your input
6 1 3 1 2 3 3
Output
1
* */

// Approach

/*

Importent Revrse Pair :
 if i<j && A[i] > 2*A[j] that type of pair is called reverse pair.

  A = [1, 3, 2, 3, 1]

Observation :

1) 2 pointer will not work here, if we use i=0 &j=n-1 then start perform operation we are not sure that when we should increment i and decrement j

2) Initial Sorting also will not work, if you initially sort the array then we will loss actual position of element

3)We can use here merge sort here
    Remember merge sort technique
                        1 3 2         3 1
                    1 3   2 2        3 3  1 1


* */
package com.dsa.advance.sorting;

import java.util.ArrayList;

// https://www.youtube.com/watch?v=S6rsAlj_iB4
public class ReversePair {
    public int solve(int[] A) {
        return mergeSort(A, 0, A.length - 1);
    }

    int mergeSort(int[] A, int low, int high) {
        if (low >= high)
            return 0;
        int mid = (low + high) / 2;

        int inv = mergeSort(A, low, mid);
        inv += mergeSort(A, mid + 1, high);

        inv += merge(A, low, mid, high);

        return inv;
    }

    int merge(int[] A, int low, int mid, int high) {
        int cnt = 0;
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (j <= high && A[i] > (2 * (long) A[j])) {  // j<=high right Array exhausted
                j++;
            }
            cnt += (j - (mid + 1));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (A[left] <= A[right]) {
                temp.add(A[left++]);
            } else {
                temp.add(A[right++]);
            }
        }

        // Copying element
        while (left <= mid) {
            temp.add(A[left++]);
        }
        while (right <= high) {
            temp.add(A[right++]);
        }

        for (int i = low; i <= high; i++) {
            A[i] = temp.get(i - low);
        }
        return cnt;
    }

    public void merge2(int a[], int start, int mid, int end) {
        int n1 = (mid - start + 1);
        int n2 = (end - mid);
        int[] L = new int[n1], R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = a[start + i];

        for (int j = 0; j < n2; j++)
            R[j] = a[mid + 1 + j];

        int i = 0, j = 0;

        for (int k = start; k <= end; k++) {
            if (j >= n2 || (i < n1 && L[i] <= R[j]))
                a[k] = L[i++];
            else
                a[k] = R[j++];
        }
    }

    public int mergesort_and_count(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            int count = mergesort_and_count(a, start, mid) + mergesort_and_count(a, mid + 1, end);
            int j = mid + 1;

            for (int i = start; i <= mid; i++) {
                while (j <= end && 1l * a[i] > a[j] * 2l)
                    j++;
                count += j - (mid + 1);
            }

            merge2(a, start, mid, end);

            return count;
        } else
            return 0;
    }

    public static void main(String[] args) {
        ReversePair rv = new ReversePair();
        int[] A = {1, 3, 2, 3, 1};
        System.out.println(rv.solve(A));
    }
}
