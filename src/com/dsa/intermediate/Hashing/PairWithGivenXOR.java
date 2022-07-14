package com.dsa.intermediate.Hashing;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenXOR {
    public static int solve(int[] A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Creating Frequency Map
        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        // Iterate hashmap
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (hm.containsKey(B ^ (entry.getKey()))) {
                count++;
            }
        }
        return count/2;
    }

    public static void main(String[] args) {
        int a[] = {5, 4, 10, 15, 7, 6};
        int b[]={3, 6, 8, 10, 15, 50};
        System.out.println(solve(a,5));
        System.out.println(solve(b,5));
    }
}
