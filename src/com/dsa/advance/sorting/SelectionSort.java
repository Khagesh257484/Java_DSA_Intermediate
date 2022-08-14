/*
  Selection Sort:
        We can create a java program to sort array elements using selection sort. In selection sort algorithm, we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.

  Algo & Steps :
       1) Divide array in 2 part, one is sorted and another is unsorted part, Assume first element of an array is sorted and rest of part of an array is unsorted, search for lowest element in the unsorted part and check with the first element, if it is less than first element than swap otherwise keep it same.

       In every iteration, need to do this.

    Example : arr[] = {64, 25, 12, 22, 11}

        1) first element=64 , this is sorted and rest of part is unsorted then smallest element in unsorted part is 11, 64>11 then swap it.
           So array will be  {11, 25, 12, 22, 64}

       2) Now sorted array length is 2(11,25) then check for i=2 which is 25 & smallest element in unsorted array is 12,(25>12) swap it.
         So array will be {11, 12, 25, 22, 64}

       3) Sorted array : 11 12 25 & unsorted array : 22 64, the smallest element in unsorted array is 22 and current element is 25  & you can see that (25>22) then swap it.
         So array will be {11, 12, 22, 25, 64}

       4) Sorted Array : 11 12 22 25 & unsorted array : 64 and this is the smallest element in array itself & current element is not greater than the smallest element then no need to do anything.

* */

package com.dsa.advance.sorting;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(final int[] A) {
        // 22 45 47 11 14 17 8 9
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[index])  // Checking for smallest element in Unsorted Array and updating index value
                    index = j;

            }
            // Swapping
            int small = A[index];
            A[index] = A[i];
            A[i] = small;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(selectionSort(a)));

        int[] b = {5, 1, 12, -5, 16, 2, 12, 14};
        System.out.println(Arrays.toString(selectionSort(b)));
    }
}
