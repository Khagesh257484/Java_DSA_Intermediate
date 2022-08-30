/*
Q3. Minimum Swaps 2
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)]. It is allowed to swap any two elements (not necessarily consecutive).

Find the minimum number of swaps required to sort the array in ascending order.



Problem Constraints
1 <= N <= 100000
0 <= A[i] < N



Input Format
The only argument given is the integer array A.



Output Format
Return the minimum number of swaps.



Example Input
Input 1:

A = [1, 2, 3, 4, 0]
Input 2:

A = [2, 0, 1, 3]


Example Output
Output 1:

4
Output 2:

2


Example Explanation
Explanation 1:

 If you swap (1, 2) -> (2, 3) -> (4, 0) -> (3, 0). You will get a sorted array.
 You cannot sort it with lesser swaps.
Explanation 2:

 You cannot sort it with lesser than 2 swaps.



See Expected Output
Your input
4 0 1 3 2
Output
1

* */


// Explanation : https://www.youtube.com/watch?v=HU3brjYbd_w

package com.dsa.advance.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumSwaps2 {

    // First way but little complex
    public static int solve(int[] A) {
        int n = A.length;

        // Creating new array & storing ith value at A[i] position.
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            b[A[i]] = i;

        int swap = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != i) {
                int temp = A[i];
                A[i] = i;
                A[b[i]] = temp;
                b[temp] = b[i];
                b[i] = i;
                swap++;
            }
        }
        System.out.println(Arrays.toString(b));
        return swap;
    }

    // Second way
    public static int swap(int[] A) {
        int swap = 0;
        for (int i = 0; i < A.length; i++) {
            while (A[i] != i) {
                int tmp = A[i];
                int tmp2 = A[A[i]];
                A[i] = tmp2;
                A[tmp] = tmp;
                swap++;
            }
        }
        return swap;
    }

    // third way
    public int solve2(ArrayList<Integer> A) {
        int ans = 0;
        for(int i = 0 ; i < A.size() ; i++ ){
            while(A.get(i) != i){
                ans++;
                Collections.swap(A, i, A.get(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 0};
//        System.out.println(solve(a));
//        int[] b = {2, 0, 3, 1};
//        System.out.println(solve(b));

        int[] c = {6, 4, 0, 2, 5, 1, 3};
        System.out.println(swap(c));   // Ans= 5
    }

}
