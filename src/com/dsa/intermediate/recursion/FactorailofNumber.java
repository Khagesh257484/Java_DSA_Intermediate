package com.dsa.intermediate.recursion;
/*
Q3. Find Factorial!
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a program to find the factorial of the given number A.



Problem Constraints
0 <= A <= 12



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the factorial of the number A.



Example Input
Input 1:

 A = 4
Input 2:

 A = 1


Example Output
Output 1:

 24
Output 2:

 1


Example Explanation
Explanation 1:

 Factorial of 4 = 4 * 3 * 2 * 1 = 24
Explanation 2:

 Factorial of 1 = 1

* */
public class FactorailofNumber {
    public int solve(int A) {
        if(A==1 || A==0)
            return 1;
        else
            return solve(A-1)*A;
    }

    public static void main(String[] args) {
        FactorailofNumber fact=new FactorailofNumber();
        System.out.println(fact.solve(4));
    }
}
