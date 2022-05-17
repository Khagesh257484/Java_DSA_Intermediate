package com.dsa.intermediate.math;

/*
Q2. Concatenate Three Numbers
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.



Problem Constraints
10 <= A, B, C <= 99



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.

The third argument of input contains an integer, C.



Output Format
Return an integer representing the answer.



Example Input
Input 1:

 A = 10
 B = 20
 C = 30
Input 2:

 A = 55
 B = 43
 C = 47


Example Output
Output 1:

 102030
Output 2:

 434755


Example Explanation
Explanation 1:

 10 + 20 + 30 = 102030
Explanation 2:

 43 + 47 + 55 = 434755
 * */
public class ConcateThreeNumbers {
   /* public int solve(int A, int B, int C) {
        int min = Math.min(A, B);
        min = Math.min(min, C);

        int max = Math.max(A, B);
        max = Math.max(max, C);
        System.out.println(max + " :: " + min);
        if (A < max)
            System.out.println("Hii");


            String s = "";
        if (B > min && B < max || B == max || B == min )
            s += String.valueOf(B) + String.valueOf(max);
        else if (A > min && A < max || A == max || A == min)
            s += String.valueOf(A) + String.valueOf(max);
        else if (C > min && C < max || C == max || C == min )
            s = String.valueOf(min)+String.valueOf(C) + String.valueOf(max);

        int i = Integer.parseInt(s);
        return i;
    }*/

    public int solve(int A, int B, int C) {
        int min = Math.min(A, Math.min(B, C));
        int max = Math.max(A, Math.max(B, C));
        int middle = (A + B + C) - (min + max);
        return Integer.parseInt(String.valueOf(min).concat(String.valueOf(middle).concat(String.valueOf(max))));
    }

    public static void main(String[] args) {
        ConcateThreeNumbers concate = new ConcateThreeNumbers();
//        System.out.println(concate.solve(55, 43, 47));
//        System.out.println(concate.solve(10, 20, 30));
        System.out.println(concate.solve(28, 97, 32));

    }

}
