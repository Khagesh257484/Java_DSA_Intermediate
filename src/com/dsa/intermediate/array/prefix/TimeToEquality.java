package com.dsa.intermediate.array.prefix;

/*
Ques: Given an integer array A of size N. In one second, you can increase the value of one element by 1.
      Find the minimum time in seconds to make all elements of the array equal.

Input : A = [2, 4, 1, 3, 2]
Output : 8
Example Explanation : We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.

Observation : 1) As per example explanation, make all elements equal to max element

How Can do that :

    1) Check for max value in the array

    3) then check if max is greater than array element then add subtract array element from max and store into count variable and return it

* */
public class TimeToEquality {

    // 1) Finding MAx number from Given array
    public static int findMax(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    // 2) Calculating the time to make equality all elements in an array
    public static int solve(int A[]) {
        int max = findMax(A);
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (max > A[i])
             count=count+(max-A[i]);
        }
        return count;
    }

    public static void main(String[] args) {

        int a[]={2,4,1,3,2};
        System.out.println(solve(a));
    }
}
