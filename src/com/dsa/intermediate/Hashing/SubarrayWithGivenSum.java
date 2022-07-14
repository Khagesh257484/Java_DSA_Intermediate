/*
Q1. Subarray with given sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation
Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.



See Expected Output
* */

package com.dsa.intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarrayWithGivenSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int start = 0;
        int end = -1;
        long currSum = 0;

        // Taking long because Array has 10^5 and element can be take like 10^9, so it is beyond range of Integer but inside the Longs range.
        HashMap<Long, Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            currSum += A.get(i);

            // If current sum found in the one go
            if (currSum == B) {
                start = 0;
                end = i;
                break;
            }
            // Check for another subarray
            if (hm.containsKey(currSum - B)) {
                start = hm.get(currSum - B) + 1;
                end = i;
                break;
            }
            hm.put(currSum, i);
        }  // For loop end

        if (end != -1) {
            for (int i = start; i <= end; i++) {
                ans.add(A.get(i));
            }
        }

        if (end == -1) {
            ans.add(-1);
            return ans;
        } else
            return ans;

    }

    // Count how many sub array exist with given sum
    public int countSubarrayWithGivenSum(ArrayList<Integer> A, int B) {
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;

        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            int rsum = sum - B;
            if (hm.containsKey(sum - B)) {
                ans += hm.get(sum - B);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        SubarrayWithGivenSum test = new SubarrayWithGivenSum();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(test.solve(al, 5));
       // System.out.println(test.solve2(al,5));

        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(5, 10, 20, 100, 105));
        System.out.println(test.solve(al1, 110));
       // System.out.println(test.solve2(al1, 110));

        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(2, 3, 6, 9, 2, 11));
        System.out.println(test.solve(al2, 11));
       // System.out.println(test.solve2(al2, 11));
    }
}
