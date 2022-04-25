package com.dsa.intermediate.array.carryForwardLecture;
/*
Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.

Problem Constraints :

1 <= N <= 105
1 <= A[i] <= 108

Input Format :
First and only argument is an integer array A.

Output Format :
Return an integer array denoting all the leader elements of the array.

NOTE: Ordering in the output doesn't matter.

Example Input :
Input 1:
 A = [16, 17, 4, 3, 5, 2]

Input 2:
 A = [1, 2]

Example Output :
Output 1:
 [17, 2, 5]

Output 2:
 [2]

* */

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInArray {
    public int[] solve(int[] A) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        int[] rm = new int[n];
        // build right max Array
        for (int i = n - 1; i >= 0; i--) {
            if (i == (n - 1))
                rm[n - 1] = A[n - 1];
            else
                rm[i] = Math.max(rm[i + 1], A[i]);
        }

        // Checking actual array element with right max array elements
        for (int i = 0; i < n; i++) {
            if (A[i] >= rm[i])
                al.add(A[i]);
        }
        // Convert ArrayList Object into Array
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public static void main(String[] args) {
        LeadersInArray lia = new LeadersInArray();
        int a[] = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(lia.solve(a)));

    }
}
/*
 Observation :

 1) As per question, left side element should greater than all right side element, if it is like that than add this element in an array
 or count this element

 2)  build right max array and compare the value of actual array with right max array, if(A[i] >= Rmax[i]) true then add this
 element in the array.

* */