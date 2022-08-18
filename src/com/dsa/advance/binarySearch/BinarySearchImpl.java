/*
 Question : Implement the binary search for a given array.
       You have a given array of n size, you need to search the element in an array with O(logn) time complexity.
       if you find the element then return index if element is not present then return -1;

       int[] A={1,2,3,4,5,6}
       Target : 7 & 5

       So 5 is present then return index of 5 and 7 is not present then return -1 in output.
* */

package com.dsa.advance.binarySearch;

public class BinarySearchImpl {

    // Iterative Approach
    public static int binarySearch(int[] arr, int t) {
        if (arr.length == 0)
            return -1;
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == t)
                return mid;
            else if (t > arr[mid])
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

    // Recursive Approach
    public static int binarySearch_Rec(int[] arr, int t) {
        int s = 0, e = arr.length - 1;
        int res = binarysearch(arr, t, s, e);
        return res;


    }

    // Recursive method
    static int binarysearch(int[] arr, int t, int s, int e) {
        // Base condition : We exit from method if start > end, as we are doing in while loop in iterative approach.
        if (s > e)
            return -1;

        // Recursive case
        int mid = (s + e) / 2;

        if (arr[mid] == t) {
            return mid;
        } else if (arr[mid] > t) {
            return binarysearch(arr, t, s, mid - 1);
        } else {
            return binarysearch(arr, t, mid + 1, e);
        }


    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8, 11, 12, 15, 17};
        System.out.println(binarySearch(a, 2));
        System.out.println(binarySearch(a, 16));
        System.out.println(binarySearch(a, 3));
        System.out.println(binarySearch(a, 15));

        // Recursive approach testing
        System.out.println("\nRecursvie approach testing");
        System.out.println(binarySearch_Rec(a,2));
        System.out.println(binarySearch_Rec(a,16));
        System.out.println(binarySearch_Rec(a,3));
        System.out.println(binarySearch_Rec(a,15));
    }
}
