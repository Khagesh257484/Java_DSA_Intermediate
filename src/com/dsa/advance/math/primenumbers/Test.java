package com.dsa.advance.math.primenumbers;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        boolean[] arr = new boolean[5];    // Creating boolean array, by default it has false value
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length) - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + " , ");
        }

        System.out.println();
        Arrays.fill(arr, Boolean.TRUE);   // Changing value from False to True
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length) - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + " , ");
        }
    }
}
