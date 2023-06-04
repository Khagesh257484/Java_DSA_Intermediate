/*
Question : Noble integer
 Given n elements, calculate the nunber of noble integer in array.
 Noble Integer = (Number of element < arr[i] =arr[i]

 int[] arr ={0, 2, 2, 4, 4, 6}
 output = 1

 int[] arr={-3,0,2,2,5,5,5,5,8,8,10,10,10,14}
 output= 7

 */

package com.intermediate.sorting;

import java.util.Arrays;

public class NobleInteger2 {
    public static int nobleInteger(int[] arr) {
        Arrays.sort(arr);
        int ans = 0, less = 0;

        if (arr[0] == 0)
            ans++;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                less = i;

            if (arr[i] == less)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr ={0, 2, 2, 4, 4, 6};
        System.out.println(nobleInteger(arr));


        int[] arr1={-3,0,2,2,5,5,5,5,8,8,10,10,10,14};
        System.out.println(nobleInteger(arr1));
    }
}
