/*
Consider an array of size N with all initial values as 0. Perform the given ‘m’ add operations from index ‘a’ to ‘b’ and evaluate the highest element in the array. An add operation adds 100 to all the elements from a to b (both inclusive).

Example:

Input: n = 5, m = 3
a = 2, b = 4.
a = 1, b = 3.
a = 1, b = 2.
Output: 300
Explanation:
After I operation – A[] = {0, 100, 100, 100, 0}
After II operation – A[] = {100, 200, 200, 100, 0}
After III operation – A[] = {200, 300, 200, 100, 0}
Highest element: 300

* */

package com.intermediate.array.addOperation;

import com.intermediate.array.ArraySumFactory;

import java.util.Scanner;

/*
 In version 2 :  Instead of adding 100 from a to b, just add 100 at a & b.
* */
public class AddOperationV2 {

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();  // a & b should less than arr.length -1 and >=0, can use condition or can create one class with 2 params.
            int b = sc.nextInt();

            arr[a - 1] = arr[a - 1] + 100;
            arr[b] = arr[b] - 100;

        }

          System.out.println("Max Element of Array is : " + findMax(ArraySumFactory.createPrefixSum(arr)));
    }

    // TC : O(N*M)
}
