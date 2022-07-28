package com.dsa.advance.bitManipulation;

import java.util.Arrays;
import java.util.Collections;

public class SingleNumber3 {
    public static int[] solve(int[] A) {
        int[] ans = new int[2];
        //step-1 xor all
        int xor = 0;
        for (int x : A) {
            xor = xor ^ x;
        }
        //step-2 find out the position of rightmost set bit
        int pos = 0;
        int temp = xor;
        while ((temp & 1) != 1) {
            temp = temp >> 1;
            pos++;
        }

        //step-3 filter out no's from the array which have 1 at pos
        int setA = 0;
        for (int x : A) {
            if ((x & (1 << pos)) > 0) {
                setA = setA ^ x;
            }
        }

        // print the result
//        System.out.println(setA);
//        System.out.println(xor ^ setA);
        ans[0] = setA;
        ans[1] = xor ^ setA;
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1, 2, 3, 1, 2, 4};
        System.out.println(Arrays.toString(solve(a)));
    }
}
