/*
    Insertion Sort: We can sort array element using insertion sort. Insertion sort is good for small element, if we are sorting small elements then it is good otherwise it requires more time to sort an array.

                  -> It has less comparison steps with bubble sort, we can say that it is optimized version of bubble sort

    Ex: int[] A={1,3,7,9,16,5}

    Array is 1 3 7 9 16 5
    16 > 5 , shift to left  1 3 7 9 I 16
    9>5    1 3 7 I 9 16
    7>5    1 3 I 7 9 16
    3>5 is false so insert the element.
            So here we are checking unsorted part of an array and insert that element in correct position in unsorted array. for better clarity below is example.

    Example 2 : 8 4 1 5 9 2

      Algo: 1) Divide array in 2 part one is sorted array and second is unsorted array. In above array we can see that there is no element in form of sorted array, so we can assume that first element is sorted & rest of part is unsorted.

          2) So 8 is sorted part and after 8 all is unsorted to will start our loop from 1 to n. check if 8 is grater then next element than swap the element

          3) So array will be like 4 8 1 5 9 2 & now you can check that sorted array has 2 element (4 & 8) now. Same process will run till end.

          4) Outer loop will start from 1 to n and inner loop (will run on sorted part) will rum from Right to Left.

* */
package com.dsa.advance.sorting;

import java.util.Arrays;

public class InsertionSort {
    static int[] insertionSort(final int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int temp = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > temp) {   // try to swap condition in while loop, your program will not run
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = temp;   // j+1, because we are decreasing j value in while loop
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {8, 4, 1, 5, 9, 2};
        System.out.println(Arrays.toString(insertionSort(A)));
    }
}
