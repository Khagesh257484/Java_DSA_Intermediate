/*
Q1. Search Element
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

Problem Constraints

1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109


Input Format

First line of the input contains number of test cases as single integer T .
Next, each of the test case consists of 3 lines:

First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B


Output Format

For each test case, print on a separate line 1 if the element exists, else print 0.



Example Input

Input 1:

 1
 5
 4 1 5 9 1
 5
Input 2:

 1
 3
 7 7 2
 1


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

  B = 5  is present at position 3 in A
Explanation 2:

  B = 1  is not present in A.
* */
package com.beginner.array;

import java.util.Scanner;

public class SearchElement {
    static boolean searchElement(int[] arr, int element) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        for (int i = 1; i <= operation; i++) {
            int array_size = sc.nextInt();
            int[] arr = new int[array_size];

            // Taking input from user
            for (int j = 0; j < array_size; j++) {
                arr[j] = sc.nextInt();
            }

            int element = sc.nextInt();
            boolean elementFound = searchElement(arr, element);
            System.out.println(elementFound);
        }
    }
}
