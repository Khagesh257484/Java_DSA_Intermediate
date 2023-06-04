/*
Q2. Elements Removal
Solved
Hint bulb icon
Stuck somewhere?
Using hints is now penalty free
Check Now
Problem Description
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.



Problem Constraints
0 <= N <= 1000
1 <= A[i] <= 103



Input Format
First and only argument is an integer array A.



Output Format
Return an integer denoting the total cost of removing all elements from the array.



Example Input
Input 1:

 A = [2, 1]
Input 2:

 A = [5]


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 Given array A = [2, 1]
 Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 Remove 1 from the array => []. Cost of this operation is (1) = 1.
 So, total cost is = 3 + 1 = 4.
Explanation 2:

 There is only one element in the array. So, cost of removing is 5.
* */

/*
Question :: Given an N array elements, at every step, remove an element.
Cost to remove an element = Sum of elements present in array before removing.
Find minimum cost to remove an elements.

int[] arr ={2,1,4}

remove   Cost
2         7
1         5
4         4

Total cost is = 16

After that array is empty.

& if you sort this array in ascending order then {1,2,4}

* */

package com.intermediate.sorting;

import java.util.Arrays;
import java.util.Collections;

public class CostToRemove {
    public static int costToRemove_carryForward(Integer[] arr) {
        // To Sort array in descending order need to take Integer type not int type
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int cost = sum, sum1 = 0;
        for (int i = 1; i < n; i++) {
            sum1 = sum1 + arr[i - 1];
            cost = cost + (sum - sum1);
        }
        return cost;
    }

    public static int costToRemove_formula(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        int cost = 0, sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            cost += (i + 1) * (arr[i]);
        }
        return cost;
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 1, 4};
        System.out.println(costToRemove_carryForward(arr));

        Integer[] arr1 = {3, 5, 1, -3};
        System.out.println(costToRemove_carryForward(arr1));

        System.out.println(costToRemove_formula(arr));
        System.out.println(costToRemove_formula(arr1));
    }

}
