/*
 Divide and Conquer Algo :
      This algo contains 3 parts.
        1) Divide: This involves dividing the problem into smaller sub-problems.
        2) Conquer: Solve sub-problems by calling recursively until solved.
        3) Combine: Combine or merge the sub-problems to get the final solution of the whole problem.

   Some more algo is based on the Divide and Conquer problem, check below link.:
     https://www.geeksforgeeks.org/divide-and-conquer-algorithm-introduction/
* */

/*

 Question: Find the Max and Min of given array containing N elements, Use Divide and Conquer technique to find Max and Min.
    int[] A={70, 250, 50, 80, 140, 12, 14}
    A={68}, A={75,72} or {72,75}



* */

package com.dsa;

public class divideAndConquerAlgo {
    static int DACMax(int[] A, int index, int length) {
        int max;
        // Base Condition
        if (length == 1)
            return A[0];

        if (index >= length - 2) {
            if (A[index] > A[index + 1])  // here you can't hardcoded cause at every recursive calling index value will be change.
                return A[index];
            else
                return A[index + 1];
        }

        // Logic to find Max
        // length 3 {14,88,90}
        // Check between 14 & 88 and update it in max variable. Then check max variable with next element
        // in starting index is zero.
        max = DACMax(A, index + 1, length);

        if (A[index] > max)
            return A[index];
        else
            return max;

    }

    static int DACMin(int[] A, int index, int length) {
        int min;
        if (length == 1)
            return A[0];
        if (index >= length - 2) {
            if (A[index] < A[index + 1])
                return A[index];
            else
                return A[index + 1];
        }
        min = DACMin(A, index + 1, length);
        if (A[index] < min)
            return A[index];
        else
            return min;
    }

    public static void main(String[] args) {
        int[] A = {70};
        int[] B = {70, 45};
        int[] C = {70, 85};
        System.out.println(DACMax(A, 0, 1));
        System.out.println(DACMax(B, 0, 2));
        System.out.println(DACMax(C, 0, 2));

        int[] d = {121, 250, 50, 80, 140, 12, 14};
        System.out.println(DACMax(d, 0, d.length));
        System.out.println(DACMin(d, 0, d.length));

    }
}
