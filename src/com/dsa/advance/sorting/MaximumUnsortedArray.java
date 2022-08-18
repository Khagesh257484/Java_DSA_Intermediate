/*
Q1. Maximum Unsorted Subarray
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar such that if we sort(in ascending order) that sub-array, then the whole array should get sorted. If A is already sorted, output -1.



Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000000



Input Format
First and only argument is an array of non-negative integers of size N.



Output Format
Return an array of length two where the first element denotes the starting index(0-based) and the second element denotes the ending index(0-based) of the sub-array. If the array is already sorted, return an array containing only one element i.e. -1.



Example Input
Input 1:

A = [1, 3, 2, 4, 5]
Input 2:

A = [1, 2, 3, 4, 5]


Example Output
Output 1:

[1, 2]
Output 2:

[-1]


Example Explanation
Explanation 1:

If we sort the sub-array A1, A2, then the whole array A gets sorted.
Explanation 2:

A is already sorted.
* */

// Explanation & Approach

/*

Maximumn Unsorted Array :

  a= {1,3,2,4,5}

  b= {1,3,2,4,5}


  1) To sort entire array we need to sort the min subarray, in array a if we sort subarray 3,2,4 then entire subarray will be sorted . same as in B if we sort subarray 3,2 then entire array will be sorted. To sort subarray we need start and end index

  2) How will be get start and end index.
     check from left to right, if ith element is greater than (i+1)th element that means this part of array is unsorted, so can we mark this ith index as start index.
				   if(a[i] > a[i+1]){
					   start=i;
					   break;
				   }

	 check from right to left, if jth element is less than (j-1)th element that means this is unsorted part so mark it as end index.
	               if(a[j]<a[j-1]){
					   end=j;
					   break;
				   }

	   Here i & j is 2 pointer where i=0 & j=a.length-1;


  3) c={4,6,3,9,5,1,2,6}

      Step no 2 will not satisfied here, if you use step no 2 then start=1 & end= 7
      & if you sort subarray between 1 to 7 then you'll get actual array is
	  {4,1,2,3,5,6,9,6) which is not sorted.

   4) So to handle the 3 steps we need to find max and min element of that subarray from 1 to 7.
        min=1 & max=7

		Now again we will check that if any element in array from starting is greater than min then update start index
		& if any element is less than max then update the end index.

		   if(a[i]>min){
			   start=i;
		   }

		   if(a[j]<max){
			   end=j;
		   }

		   so start=0 & end=7



 Algorithm :

	  1) Get start index
	     for(int i=0;i<n-1;i++){
			 if(a[i]>a[i+1]){
				 s=i;
			 }
		 }

	  2) Get end index
	     for(int j=n-1;j>0;j--){
			 if(a[j]<a[j-1]){
				 e=j;
			 }
		 }

	  3) Get min & max between index s & e
	      for(int i=s;i<=e;i++){
			  min=Math.min(min,A[i]);
			  max=Math.max(max,A[i]);
		  }

	  4) update start and end index according max and min value
	     for(int i=0;i<n;i++){
		 if(a[i]>min){
		  start=i;
		  }
		 }

		 // update end
		 for(int j=n-1;j>=0;j--){
			 if(a[j]<max){
				 end=j;
			 }
		 }

	  5) Create array of 2 size and add into start and end index.

**/
package com.dsa.advance.sorting;

import java.util.Arrays;

public class MaximumUnsortedArray {
    public static int[] subUnsort(int[] A) {
        int i = 0, s = 0, e = 0, n = A.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        //  1) Get start index
        for (i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                s = i;
                break;
            }
        }

        // check If entire array is sorted
        int[] ans = new int[1];
        if (i == n - 1) {   // if i==n-1 that means all array is sorted
            ans[0] = -1;
            return ans;
        }

        // 2) Get end index
        for (int j = n - 1; j > 0; j--) {
            if (A[j] < A[j - 1]) {
                e = j;
                break;
            }
        }

        //  3) Get min & max between index s & e
        for (int j = s; j <= e; j++) {
           /* if (A[j] > max)
                max = A[j];

            if (A[j] < min)
                min = A[j];*/

            min = Math.min(A[j], min);
            max = Math.max(A[j], max);
        }

        //4) update start and end index according max and min value
        for (int j = 0; j < s; j++) {
            if (A[j] > min) {
                s = j;
            }
        }

        // update end
        for (int j = n - 1; j > e; j--) {
            if (A[j] < max) {
                e = j;
            }
        }

        int[] res = new int[2];
        res[0] = s;
        res[1] = e;

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 5};
        System.out.println(Arrays.toString(subUnsort(a)));

        int[] b = {4, 6, 3, 9, 5, 2};
        System.out.println(Arrays.toString(subUnsort(b)));

        int[] c = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(subUnsort(c)));
    }
}
