package com.intermediate.sorting;

import java.util.Arrays;

public class SortArrayInDescendingOrder {
    static int[] reverseOrder(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3, 6, 8, 1, 7, 10};
        System.out.println(Arrays.toString(reverseOrder(arr)));
    }
}
