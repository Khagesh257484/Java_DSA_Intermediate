package com.dsa.intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Q4. Sub-array with 0 sum
Attempted
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.



Problem Constraints
1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return whether the given array contains a subarray with a sum equal to 0.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.
* */

public class SubarrayWithZeroSum {
    public int subArrayWithZeroSum_BruteForc(ArrayList<Integer> A) {
// consider all subarrays starting from `i`
        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            // consider all subarrays ending at `j`
            for (int j = i; j < A.size(); j++) {
                // sum of elements so far
                sum += A.get(j);

                // if the sum is seen before, we have found a subarray with zero-sum
                if (sum == 0) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public int optimizedOne(int[] A) {
        // Create Prefix sum
        int[] prefSum = new int[A.length];
        prefSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefSum[i] = prefSum[i - 1] + A[i];

        }
        //   System.out.println(Arrays.toString(prefSum));

        // Creating HashSet
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (hs.contains(prefSum[i]))
                return 1;
            else
                hs.add(prefSum[i]);
        }
        if (hs.contains(0))
            return 1;
        else
            return 0;

    }

    public int optimizedTwo(int[] A) {
        int flag = 0;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            set.add(sum);
            sum += A[i];
            if (set.contains(sum)) {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        SubarrayWithZeroSum t=new SubarrayWithZeroSum();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 2, -3, 1, 6));
        // System.out.println(t.subArrayWithZeroSum_BruteForc(al));
        // System.out.println(t.optimizedOne(al));

        int[] a = {4, 2, -3, 1, 6};
        System.out.println(t.optimizedOne(a));
    }
}
