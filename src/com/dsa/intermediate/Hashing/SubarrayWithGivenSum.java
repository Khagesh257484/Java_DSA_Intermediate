package com.dsa.intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarrayWithGivenSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int start = 0;
        int end = -1;
        int currSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
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

        return null;

    }

    public static void main(String[] args) {
        SubarrayWithGivenSum test=new SubarrayWithGivenSum();
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(test.solve(al,5));

        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(5, 10, 20, 100, 105));
        System.out.println(test.solve(al1,110));
    }
}
