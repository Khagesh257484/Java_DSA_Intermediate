package com.dsa.intermediate.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

/*
Q5. Odd Even Subsequences
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given an array of integers A of size, N. Find the longest subsequence of A, which is odd-even.

A subsequence is said to be odd-even in the following cases:

The first element of the subsequence is odd; the second element is even, the third element is odd, and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]

The first element of the subsequence is even, the second element is odd, the third element is even, and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]

Return the maximum possible length of odd-even subsequence.

Note: An array B is a subsequence of an array A if B can be obtained from A by deleting several (possibly, zero, or all) elements.


Input Format

The only argument given is the integer array A.
Output Format

Return the maximum possible length of odd-even subsequence.
Constraints

1 <= N <= 100000
1 <= A[i] <= 10^9
For Example

Input 1:
    A = [1, 2, 2, 5, 6]
Output 1:
    4
    Explanation 1:
        Maximum length odd even subsequence is [1, 2, 5, 6]

Input 2:
    A = [2, 2, 2, 2, 2, 2]
Output 2:
    1
    Explanation 2:
        Maximum length odd even subsequence is [2]
* */

public class OddEvenSubsequences {
    /*
     Here no need to traverse all the subsequences, just need to check that if first element is even then next element should odd and vice versa

     1) for this, we can take one List Object and add first element from the array in it.

     2) Now check if List element is odd then need to insert even and vice versa

     3) Need to take al.size(), cause suppose if in array you have only 2 elements but current index value is 5. So how can we manage this.
     to manage this take last element of arraylist and check with ith index of array

     4) if Condition match then finally add

    * */

    public static int oddEvenSub(ArrayList<Integer> A) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(A.get(0));   // i=0
        for (int i = 1; i < A.size(); i++) {
            if (al.get(al.size() - 1) % 2 != 0 && A.get(i) % 2 == 0) {
                al.add(A.get(i));
            } else if (al.get(al.size() - 1) % 2 == 0 && A.get(i) % 2 != 0) {
                al.add(A.get(i));
            }
        }
        return al.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 2, 5, 6));
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2, 2, 2));
        // 2, 2, 2, 2, 2, 2
        System.out.println(oddEvenSub(al));
        System.out.println(oddEvenSub(al1));
    }
}
