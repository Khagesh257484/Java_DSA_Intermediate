package com.dsa.intermediate.Hashing;

import java.util.Collections;
import java.util.HashMap;

public class KDifference {

    // TC : O(N^2), SC=O(1)
    public static int bruteForce(int[] A, int B) {
        //Edge cases, if Array is empty
        if (A.length == 0)
            return 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                int diff = A[i] - A[j];
                if (Math.abs(diff) == B & i != j)
                    return 1;
            }
        }
        return 0;
    }


    // 1 11 3 8 9 6 7 , B= 6 , B= 1
    public static int optimizedOne(int[] A, int B) {
        // Sort Array from left to right
        // then subtract element and check

        // Sorted Array  : 1 3 5 6 7 8 9 , B= 4 ;

        if (A.length == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            // Creating frequency Map
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

            // Check if any element whose frequency
            // is greater than 1 exist or not for n == 0
            if (B == 0 && map.get(A[i]) > 1)
                return 1;

        }
        // System.out.println(map);

        if (B == 0)
            return 0;

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(B + A[i]))
                return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 7, 4, 7};
        int[] b = {1, 5, 4, 1, 2};
        System.out.println(bruteForce(a, 3));  // exist
        System.out.println(bruteForce(a, 1));  // exist
        System.out.println(bruteForce(a, 30)); // does not exist

        System.out.println("----------------");
        System.out.println(optimizedOne(b, 0));  // exist
        System.out.println(optimizedOne(b, 1));  // exist
        System.out.println(optimizedOne(b, 30)); // does not exist

        //optimizedOne(a, 3);

    }

}
