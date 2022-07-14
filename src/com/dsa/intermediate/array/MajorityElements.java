package com.dsa.intermediate.array;

public class MajorityElements {
    public int majorityElement(final int[] A) {
        int elem = A[0], freq = 1;

        // Check Frequency of element
        for (int i = 1; i < A.length; i++) {
            if (A[i]==elem) {
                freq++;
            } else {
                if (freq == 0) {
                    elem = A[i];
                    freq++;
                } else {
                    freq--;
                }
            }
        }

        // Check if element is majority
        int c = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]==elem)
                c++;
        }
        if (c > (A.length / 2)) {
            return elem;
        }
        return elem;
    }

    public static void main(String[] args) {
        MajorityElements elements = new MajorityElements();
        int[] a = {2, 1, 1};
        System.out.println(elements.majorityElement(a));

    }
}
