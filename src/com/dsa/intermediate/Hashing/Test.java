package com.dsa.intermediate.Hashing;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 4, 5, 6};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }

        //int[] b = {5, 6, 7, 8, 9, 6, 7, 8};
        int[] b = {1, 2, 3, 4, 5, 6, 4, 5, 6};
        HashMap<Integer,Integer> hm1=new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            if (hm1.containsKey(b[i])) {
                hm1.put(b[i], hm1.get(b[i]) + 1);
            } else {
                hm1.put(b[i], 1);
            }
        }

        System.out.println(hm);
        System.out.println(hm1);

    }
}
