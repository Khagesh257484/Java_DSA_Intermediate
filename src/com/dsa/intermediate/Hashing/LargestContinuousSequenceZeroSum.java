package com.dsa.intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
Q3. Largest Continuous Sequence Zero Sum
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.

* */
public class LargestContinuousSequenceZeroSum {

    // This method will give the longest sub-array length which has sum=0;
    public int getLongestLengthSubarrayWithZeroSum(ArrayList<Integer> A) {
        ArrayList<Integer> prefSum = getPrefixSum(A);
        ArrayList<Integer> al = new ArrayList<>();
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            // Edge cases
            if (prefSum.get(i) == 0)
                ans = Math.max(ans, i + 1);
            else if (hm.containsKey(prefSum.get(i))) {
                int newlength = i - hm.get(prefSum.get(i));
                ans = Math.max(ans, newlength);
            } else
                hm.put(prefSum.get(i), i);
        }
        System.out.println("kkk");
        System.out.println(hm.toString());
        return ans;
    }


    // This method will give the Largest sub array which has sum zero

    public ArrayList<Integer> getPrefixSum(ArrayList<Integer> al) {
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(0, al.get(0));
        for (int i = 1; i < al.size(); i++) {
            prefixSum.add(i, (prefixSum.get(i - 1) + al.get(i)));
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        LargestContinuousSequenceZeroSum t = new LargestContinuousSequenceZeroSum();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 2, -3, 1, 6));
                System.out.println(t.getLongestLengthSubarrayWithZeroSum(al));


        // System.out.println(t.subArrayWithZeroSum_BruteForc(al));
        // System.out.println(t.optimizedOne(al));

        int[] a = {4, 2, -3, 1, 6};
        System.out.println();
    }
}
