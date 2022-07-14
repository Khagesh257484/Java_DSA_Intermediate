package com.dsa.advance.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAbsoluteDifference {
    public static int maxArr(ArrayList<Integer> A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            max1 = Math.max(max1, A.get(i) + i);

            max2 = Math.max(max2, -A.get(i) + i);
           // max2 = Math.max(max2, A.get(i) - i);

            min1 = Math.min(min1, A.get(i) + i);
            min2 = Math.min(min2, -A.get(i) + i);
            //min2 = Math.min(min2, A.get(i) - i);  // in this, just doing simple math calculation that multiply with -ve sign
        }
        //System.out.println("Max1 = " + max1 + " :: " + "Max2 = " + max2 + " :: " + "Min1 = " + min1 + " :: " + "Min2 = " + min2);
        return Math.max(max1 - min1, max2 - min2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -3, 1));
        System.out.println(maxArr(list));


    }
}
