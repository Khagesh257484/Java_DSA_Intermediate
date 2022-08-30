package com.dsa.intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        //System.out.println(hm.toString());
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

    // This method will give the array of the largest subsequence which has 0 sum
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        map.put(0, -1);

        int start = -1;
        int end = -1;
        int sum = 0;
        int maxLen = -1;

        // int[] a= [4, 2, -3, 1, 6]
        // Observation : When any sum is equal to any element of the array that means your array element sum from next point(index) till
        // existing sum index will be zero

        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            if (map.containsKey(sum)) {
                // System.out.println(map.get(sum));  // 0( it is index value of that sum which exist in the array ) 4 exist at 0th index
                if (maxLen < (i - map.get(sum))) {  // sum is key here and index is value as we are using in put method
                    //   System.out.println(map.get(sum));  // 0
                    start = map.get(sum) + 1;
                    end = i;
                    maxLen = i - map.get(sum); // 3-0=3(maxLength) : Can not use start because it is zero index

                    // if you want first subsequence sum 0 in an array then we can return it from here no need to check but if we want max
                    // length sum then we have to continue to check till last
                }
            } else {
                map.put(sum, i);
                //map.get(sum);
            }
        }

        if (start >= 0 && end >= 0) {
            for (int i = start; i <= end; i++) {
                result.add(A.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LargestContinuousSequenceZeroSum t = new LargestContinuousSequenceZeroSum();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 2, -3, 1, 6));
        System.out.println(t.getLongestLengthSubarrayWithZeroSum(al));
        System.out.println(t.lszero(al));


        // System.out.println(t.subArrayWithZeroSum_BruteForc(al));
        // System.out.println(t.optimizedOne(al));

        int[] a = {4, 2, -3, 1, 6};
        System.out.println();
    }
}
