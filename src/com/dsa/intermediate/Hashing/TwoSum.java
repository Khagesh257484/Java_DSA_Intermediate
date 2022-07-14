package com.dsa.intermediate.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    // TC : O(n^2), SC : O(1)
    public static int[] bruteForce(final int[] A, int B) {
        int[] result = new int[2];
        for (int i = 0; i < A.length - 1; i++) {  // If use till length then will give exception and also if we at second last element then can get last

            for (int j = 0; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    result[0] = i + 1;  // i and j will give the index and A[i] and A[j] will give the value
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return new int[0];

    }

    /*
      Observation : 1) So as per question index1 < index2, so we can do sorting
                    2) We can use 2 pointer technique, need minimum index if having multiple solution. In sorting no need to maintain
                       the variable for this Minimum value.

                    3)


     */

    // This method will return pair which has sum equal target but it will return pair only for non-repetitive numbers
    public static int[] findSum(int arr[], int n, int target) {
        int i, findElement;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for (i = 0; i < n; i++) {
            mp.put(arr[i], i);
        }

        int result[] = {0, 0};
        for (i = 0; i < n; i++) {
            findElement = target - arr[i];
            if (mp.containsKey(findElement)) {
                result[0] = i + 1;
                result[1] = mp.get(findElement) + 1;
                break;
            }

        }
        // If target not found then return the empty array
        if (result[0] == 0 & result[1] == 0)
            return new int[0];

        return result;
    }

    // Above findSum method will fail if we have repetition number in array as per Question
    // int C[] = {1,1,1, 4, 45, 6,8, 10, 8};
    public static int[] twoSum(final int[] A, int B) {
        int n = A.length, elem;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            elem = B - A[i];
            if (hm.containsKey(elem)) {
                result[1] = i + 1;
                result[0] = hm.get(elem) + 1;
                break;
            }
            if (!hm.containsKey(A[i])) {
                hm.put(A[i], i);
            }
        }

        if (result[0] == 0 && result[1] == 0) {
            return new int[0];
        }
        System.out.println(hm);
        return result;

    }


    public static void main(String[] args) {
        int[] A = {2, 5, 7, 11, 15};
        //System.out.println(Arrays.toString(bruteForce(A, 9)));
//        System.out.println(Arrays.toString(findSum(A, A.length, 9)));

        int[] B = {2, 7, 11, 15};
//        System.out.println(Arrays.toString(findSum(B, B.length, 9)));

        int C[] = {1, 1, 1, 4, 45, 6, 8, 10, 8};
        System.out.println(Arrays.toString(twoSum(C, 9)));


    }
}
