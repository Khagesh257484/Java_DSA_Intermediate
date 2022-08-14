/*
 Quick Sort : It is based on the divide and conquer algorithm.

 Divide :First Pick the pivot element( you can pick from the left, right, mid, or any random number ), after that arrange all
         array element left side which is less than the pivot & arrange element right side which is greater than the pivot.

         This technique is called the partitioning and return pivot element from the method.

 Partitioning: int[] A={12, 2, 5, 3, 14, 17, 8, 9}
               int[] B={4, 6, 2, 5, 7, 9, 1, 3}

            1) Let's take first element as pivot element. int pivot=A[i]=4
                Now arrange all small element in left side and all greater element in right side. How will do that.

            2) Need to take 2 pointer i & j,
                i will move towards right side till getting element less than pivot, if any element is greater than i it will stop.
                   if(pivot >=A[i]) then increase i, So in first step i will increase
                j will move towards left side till getting element greater than j, if any element is lees than j it will stop.
                   if(pivot <=A[j]) then decrease i, in first step j will not decrease

                if condition not satisfied swap i & j .

            3) i : 4 is equal to 4, condition satisfied increase i=1, for i=1 : 4 is not greater than 6
               j : 4 is not less than 3, j will not decrease
                A= 4 3 2 5 7 9 1 6

            4) do same thing & for i :  4 is not greater than 5
                for j : 4 is not less than 1 but less than 6, j decrease by 1
                swap i(5) * j (1)
                A= 4 3 2 1 7 9 5 6

                doing same thing, if i goes greater than j then stop
                ith index=4 & jth index=5

              5) after completing 4th condition, swap j-1 with i=0; or swap pivot element with j
                  1 3 2 4 7 9 5 6
                   You can check after partitioning all element is less than pivot is arranged in left side and greater element is arranged
                   in right side.




* */
package com.dsa.advance.sorting;

import java.util.Arrays;

// More Questions : https://community.scaler.com/t/maximum-and-minimum-magic/5367/3
public class QuickSortImpl {
    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (i<arr.length &&arr[i] <= pivot) {
                i++;
            }
            while (j>=0 &&arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

       // System.out.println(Arrays.toString(arr));
        return j;

    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int[] solve(int[] A) {
        quickSort(A, 0, A.length - 1);
        return A;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = a[temp];
    }

    public static void main(String[] args) {
        int[] A = {4, 6, 2, 5,1, 7, 9, 1, 3};
       // System.out.println((partition(A, 0, A.length - 1)));
        System.out.println(Arrays.toString(solve(A)));

    }
}
