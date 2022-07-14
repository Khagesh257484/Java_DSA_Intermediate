package com.dsa.intermediate.Hashing;

import java.util.HashMap;

public class IsDictionary {
    public static int solve(String[] A, String B) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < B.length(); i++) {
            hm.put(B.charAt(i), i);
        }

        for (int i = 0; i < A.length - 1; i++) {
            if (!compareString(A[i], A[i + 1], hm))
                return 0;
        }

        return 1;

    }

    public static boolean compareString(String A, String B, HashMap<Character, Integer> dict) {
        for (int i = 0; i < Math.min(A.length(), B.length()); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                int x = dict.get(A.charAt(i));
                int y = dict.get(B.charAt(i));

                if (x > y)
                    return false;
                if (x < y)
                    return true;

            }
        }
        return A.length() <= B.length();
    }

    public static void main(String[] args) {
        String[] A = {"hello", "scaler", "interviewbit"};
        String B = "adhbcfegskjlponmirqtxwuvzy";
        System.out.println(solve(A, B));

        String[] C = {"fine", "none", "no"};
        String D = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(solve(C, D));

    }
}
