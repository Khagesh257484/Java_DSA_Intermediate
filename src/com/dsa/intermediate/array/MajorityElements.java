package com.dsa.intermediate.array;

public class MajorityElements {
    public int majorityElement(final int[] A) {
        int n = A.length;
        int elem = A[0];
        int freq = 1;

        // Check Frequency
        for (int i = 0; i < A.length; i++) {
            if (A[i] == elem)
                freq++;
            else {
                if (freq == 0) {
                    elem = A[i];
                    freq = 1;
                } else {
                    freq--;
                }
            }
        }

        System.out.println(elem);
        // Check if element is majority
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == elem)
                c++;
        }
        if (c > n / 2) {
            return elem;
        }
        else
            return A.length;


    }

    public static void main(String[] args) {
        MajorityElements elements=new MajorityElements();
        int[] a={2, 1, 1};
        System.out.println(elements.majorityElement(a));

    }
}
