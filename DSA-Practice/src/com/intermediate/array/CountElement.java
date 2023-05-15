/*
  Given an integer array, count the number of elements in array having at least 1 number greater than itself.
  arr={-3,-2,6,8,4,8,5}

  ans=5;
* */

package com.intermediate.array;

public class CountElement {
    public static int countElement(int[] arr) {
        // find max no
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // Find all count in array less than the max
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -2, 6, 8, 4, 8, 5};
        System.out.println(countElement(arr));
    }
    /*
     But if we count using min element then we'll get ans 6, cause 8 is duplicate here.
     what if we don't want to consider duplicate element
    * */
}
