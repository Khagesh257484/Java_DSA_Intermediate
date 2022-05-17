package com.dsa.intermediate.Hashing;
/*
Q2. First Repeating element
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109



Input Format
The first and only argument is an integer array A of size N.



Output Format
Return an integer denoting the first repeating element.



Example Input
Input 1:

 A = [10, 5, 3, 4, 3, 5, 6]
Input 2:

 A = [6, 10, 5, 4, 9, 120]


Example Output
Output 1:

 5
Output 2:

 -1


Example Explanation
Explanation 1:

 5 is the first element that repeats
Explanation 2:

 There is no repeating element, output -1

* */
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
    public int solve(int[] A) {
        // Initialize index of first repeating element
        int repeatIndex = -1;
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array from right to left
        for (int i=A.length-1; i>=0; i--)
        {
            if (set.contains(A[i]))
                repeatIndex = i;
            else
                set.add(A[i]);
        }
        if (repeatIndex != -1)
            return A[repeatIndex];
        else
            return -1;
    }

    public static void main(String[] args) {
        FirstRepeatingElement element = new FirstRepeatingElement();
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(element.solve(A));
    }
}
