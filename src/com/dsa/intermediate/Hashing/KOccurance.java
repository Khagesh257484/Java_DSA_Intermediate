package com.dsa.intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KOccurance {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < A; i++) {
            if (hm.containsKey(C.get(i))) {
                hm.put(C.get(i), hm.get(C.get(i)) + 1);

            } else {
                hm.put(C.get(i), 1);

            }
        }

        boolean found = false;
        for (int h : hm.keySet()) {
            if (hm.get(h) == B) {
                ans = ans + h;
                found = true;
            }
        }
        if (!found)
            return -1;
        else
            return (int) (ans % 1000000007);
    }


    public static void main(String[] args) {
        KOccurance k = new KOccurance();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        System.out.println(k.getSum(5, 2, al));

        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(3, 0, 2));
        System.out.println(k.getSum(3, 1, al1));

        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(0, 0, 2));
        System.out.println(k.getSum(3, 2, al2));

        ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        System.out.println(k.getSum(4, 1, al3));


    }
}
