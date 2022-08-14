package com.dsa.advance.sorting;

import java.util.Arrays;

public class AllSortingImpl {
    static int[] bubbleSortImpl(final int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (A[j - 1] > A[j]) {
                    int temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }

    // 13, 8, -7, 43, -6, 11, 4, 9, 6
    static int[] insertionSortImpl(final int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int temp = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > temp) {
                A[j] = A[j + 1];
            }
            A[j + 1] = temp;
        }

        return A;
    }

    // 13, 8, -7, 43, -6, 11, 4, 9, 6
    static int[] selectionSortImpl(final int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (A[index] > A[j]) {
                    index = j;     // index with small element in unsorted array
                }
            }
            int small=A[index];
            A[i]=small;
            A[index]=A[i];
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {13, 8, -7, 43, -6, 11, 4, 9, 6};
        System.out.println("Original Array is : " + Arrays.toString(A));
        System.out.println("Sorting with Bubble Sort....");
        System.out.println(Arrays.toString(bubbleSortImpl(A)));

        System.out.println("Sorting with Insertion Sort....");
        System.out.println(Arrays.toString(insertionSortImpl(A)));

        System.out.println("Sorting with Selection Sort....");
        System.out.println(Arrays.toString(selectionSortImpl(A)));


    }
}
