/*
 Print all sub array  of given array
 int[] arr={1,3,5,7,6,8}
* */

package com.intermediate.array.addOperation;

public class PrintSubarray {

    static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    static void printAllSubArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                printSubarray(arr, i, j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={10,20,30};
        printAllSubArray(arr);
    }

}
