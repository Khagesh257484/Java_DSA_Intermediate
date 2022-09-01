/*
Q1. Inversion count in an array
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 100000

1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return the number of inversions of A modulo (109 + 7).



Example Input
Input 1:

A = [3, 2, 1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 All pairs are inversions.
Explanation 2:

 No inversions.



See Expected Output
Your input
5 9 8 7 6 5
Output
10
* */

package com.dsa.advance.sorting;

// Approach
/*
    0  1  2
A = [3, 2, 1]

A ={1,2,3}

	{3, 1, 2}


// Sort an array using merge sort
// https://www.youtube.com/watch?v=uojx--MK_n0

Observation :

1) If array is sorted in ascending order then count will be zero
    1,2,3,4

2) If array is sorted in descending order then count will be max.
    10,9,8,7
	ncr=4c2=4*3/2=6
	9 8 7 6 5 , n= 5
	ncr=5c2=5*4/2=10

3) If Array is not sorted then it is bit difficult to find out
    32 26 1 4 3 2 8 3 6 7 5 14 12 11 9 7 8 , n= 17

	1) If you sort in ascending then you'll get 0 inversion count

	2) If you sort in descending then you will get ncr , so both sorting will not work.

	So you can use merge sort here.


  int[] a= 2 4 1 3 5
  int[] a= 8 5 3 4 1 6 2

 Merge Sort :

 1) We can divide array in 2 equal part, to divide it take 2 variable low=0 & high=n-1 and find out the mid value of this array and divide in 2 part

	low+high(0+6)/2=3

	   (0,3)                  (4,6)
	     |                      |
	(0,1)     (2,3)           (4,5)  (6,6) : this 6 & 6 is sorted if low==high then don't take mid
	  |         |               |
(0,0)  (1,1)  (2,2) (3,3)  (4,4) (5,5)           4


* */


// https://www.youtube.com/watch?v=uojx--MK_n0
public class InversionCount {
    public int solve(int[] A) {
        long mod = 1000000007;
        int n = A.length;
        if (A.length == 0 || A.length == 1)
            return 0;
        int[] temp = new int[n];
        long ans = merge_Sort(A, temp, 0, n - 1);
        ans = ans % mod;
        return (int) ans;
    }

    long merge(int arr[], int temp[], int left, int mid, int right) {
        long inv_count = 0;
        int i = left;
        int j = mid;
        int k = left;
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }

        while (i <= mid - 1)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = temp[i];

        return inv_count;
    }

    long merge_Sort(int arr[], int temp[], int left, int right) {
        int mid;
        long inv_count = 0;
        if (right > left) {
            mid = (left + right) / 2;

            inv_count += merge_Sort(arr, temp, left, mid);
            inv_count += merge_Sort(arr, temp, mid + 1, right);

            inv_count += merge(arr, temp, left, mid + 1, right);
        }
        return inv_count;
    }

    public static void main(String[] args) {
        InversionCount iv = new InversionCount();
        int[] a = {5, 3, 2, 1, 4};
        System.out.println(iv.solve(a));

        int[] b = {7, 8, 3, 1, 2};
        System.out.println(iv.solve(b));
    }
}
