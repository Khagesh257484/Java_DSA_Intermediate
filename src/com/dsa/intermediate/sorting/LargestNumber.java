
/*
Q2. Largest Number
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109



Input Format
The first argument is an array of integers.



Output Format
Return a string representing the largest number.



Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]


Example Output
Output 1:

 "9534330"
Output 2:

 "9320"


Example Explanation
Explanation 1:

Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
* */

package com.dsa.intermediate.sorting;

import java.util.*;

public class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        ArrayList<String> al = new ArrayList<>();

        // Changing int value into String
        for (int i = 0; i < A.size(); i++) {
            al.add(String.valueOf(A.get(i)));
        }

        // Sorting using custom comparator class
        Collections.sort(al, new Sort());

        if (al.get(0).equals("0"))
            return "0";
        else {
            String ans = "";
            for (int i = 0; i < al.size(); i++) {
                ans = ans.concat(al.get(i));
            }
            return ans;
        }
    }

}

class Sort implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String a1 = a.concat(b);
        String a2 = b.concat(a);
        return a2.compareTo(a1);
    }

    public static void main(String[] args) {
        LargestNumber number = new LargestNumber();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(2, 3, 9, 0));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(0, 0, 0, 0));

        System.out.println(number.largestNumber(al));
        System.out.println(number.largestNumber(al1));
        System.out.println(number.largestNumber(al2));
    }
}


