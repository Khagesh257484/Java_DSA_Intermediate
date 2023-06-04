package com.intermediate.sorting;

import java.util.Arrays;

public class NobleInteger {

    public static int countNobleInteger_naive(int[] arr) {
        int ans = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] > 0 && arr[j] < arr[i])
                    count++;
            }
            if (count == arr[i])
                ans = ans + 1;
        }
        return ans;
    }

    public static int nobleInteger(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 && arr[i]==i)
                ans++;
        }
        return ans;
    }
        public static void main (String[]args){
            int[] arr = {1, -5, 3, 5, -10, 4};
            System.out.println(countNobleInteger_naive(arr));
            System.out.println(nobleInteger(arr));
            // System.out.println(1<1);
        }
    }
