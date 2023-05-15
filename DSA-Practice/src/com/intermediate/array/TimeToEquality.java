/*
Q1. Time to equality
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format
First argument is an integer array A.


Output Format
Return an integer denoting the minimum time to make all elements equal.


Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.



See Expected Output
* */

package com.intermediate.array;

public class TimeToEquality {
    public int findMaxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public int solve(int[] arr){
        int max=findMaxInArray(arr);

        int time=0;
        for(int i=0;i<arr.length;i++){
            time=time+(max-arr[i]);
        }
        return time;
    }

    public static void main(String[] args) {
        TimeToEquality te= new TimeToEquality();

        int[] arr={2, 4, 1, 3, 2};
        System.out.println(te.solve(arr));
    }
}
