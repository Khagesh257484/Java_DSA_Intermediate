package com.dsa.intermediate.array.carryForwardLecture;

/*
Problem Description
You are given an integer array A.
Check that is one or more than one sub array present which start  and end with even element and length should be even also.
Return "YES" if it is possible; otherwise, return "NO" (without quotes).

Problem Constraints
1 <= |A|, A[i] <= 106

Input Format
The first and the only input argument is an integer array, A.

Output Format
Return a string "YES" or "NO" denoting the answer.

Example Input
Input 1:
 A = [2, 4, 8, 6]

Input 2:
 A = [2, 4, 8, 7, 6]

Example Output
Output 1:
 "YES"

Output 2:
 "NO"

Example Explanation
Explanation 1:
 We can divide A into [2, 4] and [8, 6].

Explanation 2:
 There is no way to divide the array into even length subarrays.

* */
public class EvenSubArray2 {
    public String solve(int[] A) {
        int n = A.length, sub_length = 0;
        if (A[0] % 2 == 0 && A[n - 1] % 2 == 0 && n % 2 == 0)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        EvenSubArray2 evenSubArray = new EvenSubArray2();
        //int[] a={1,1,4,5,7,8,10,5};
        int[] a = {2, 4, 8, 7, 6};
        System.out.println(evenSubArray.solve(a));
    }
}
