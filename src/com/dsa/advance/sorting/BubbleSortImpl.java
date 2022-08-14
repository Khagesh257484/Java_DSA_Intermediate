/*
Sorting :
          1) Sorting is used in java to sort the array, we can use different-different algo to sort the Arrays or things.

		  2) Every Sorting technique has different time complexity on the basis of operation, some takes O(N^2), O(NLogN), and Some takes O(N). O(N) is the better time complexity and O(N^2) is worst time complexity.

		   In this we will learn different techniques of Sorting.


1) Bubble Sort :
          -> To Sort an array we used this.

    Algo & Steps :   int[] A={3, 60, 35, 2, 45, 320, 5}
            1) Compare first element with second element if first element is greater than second element than swap it, if less than just keep it same and check for next 2 elements.

            2) To check first element, loop will run from 0 to n
               To compare with another element loop will run

    Dry Run : int[] A={60, 3, 35, 2, 45, 320, 5}
            1) for i=0 and i=1, 0th element is greater than first element so swap it & array will be like
                  {3 60 35 2 45 320 5}

            2)


          -> We have inbuilt function to sort the array. Arrays.sort(Object of Array). this takes O(Nlogn) time to sort an array.

		  For example : You have a given array of N element in unsorted format, Need to sort this array using Bubble sort. We have also inbuilt function to Sort an Array that we can use but here we want to learn about bubble sort so need to implement the bubble sort.

		  Input Array  : int[] A={3, 60, 35, 2, 45, 320, 5};
		     Can use Arrays.sort(A) : but need to implement the Bubble sort.
		  Output Array : int[] A= {2 3 5 35 45 60 320};


* */
package com.dsa.advance.sorting;

import java.util.Arrays;

public class BubbleSortImpl {
    static int[] bubble(final int[] A) {
        int n = A.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n -i); j++) {
                // Question : can we use j=i+1
                // Answer : no but why ?
                // Swap elements
                // initially j=1(next) and i=0(previous)
                if (A[j - 1] > A[j]) {  // To sort in descending order : if (A[j - 1] < A[j])
                    temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }
            }

        }
        return A;
        // Start i & j from zero
        /*
          start i and j from 0
         for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
        * */
    }

    public static void main(String[] args) {


        // Arrays.sort(ArrayObject) Implementation
        String[] s = {"Khagesh", "Amit", "Anil", "Raghav", "Pintu", "Eight", "Nine"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        int[] A = {60, 3, 35, 2, 45, 320, 5};
        // check every element with next element and compare if previous element is greater than the next element than swap the value on that index positions, if you are on index 0 then do it same process for 1 to (n-0) element.
        //                        if on index 1 then do it for (n-1) element so on.....

        //
        System.out.println(Arrays.toString(bubble(A)));
    }
}
