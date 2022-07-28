/*
Q1. A, B and Modulo
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.



Problem Constraints
1 <= A, B <= 109
A != B



Input Format
The first argument is an integer A.
The second argument is an integer B.



Output Format
Return an integer denoting the greatest possible positive M.



Example Input
Input 1:

A = 1
B = 2
Input 2:

A = 5
B = 10


Example Output
Output 1:

1
Output 2:

5


Example Explanation
Explanation 1:

1 is the largest value of M such that A % M == B % M.
Explanation 2:

For M = 5, A % M = 0 and B % M = 0.

No value greater than M = 5, satisfies the condition.



See Expected Output
Your input
12 24
Output
12

* */

package com.dsa.advance.math.modulo;

public class ABandModulo {

    // As per problem constraint, range for B till 10^9  :: that means solution will be less than in O(N) time. Solution can vary in
    // logn and constant time, that will be best time complexity
    // So this is correct approach but not optimized
    public static int solve(int A, int B) {
        int n = Math.max(A, B);    // Taking max cause answer can take place after A.
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if (A % i == B % i)
                ans = i;
        }
        return ans;
    }


    // Optimized Approach
    /*
     if you observe A=11 & B= 13 then answer of this will be 2 cause 2 is the greatest number which gives same reminder after taking
     modulo

     Ex2 : A=12 , B=36 : the greatest number will be 24

     Observation : Observe that if you Subtract A from B then you'll get same number

     Solution : Math.abs(A-B); :: Take absolute value or positive value if you even get negative
    * */

    static int mod_Opt(int A, int B) {
        return Math.abs(A - B);
    }

    public static void main(String[] args) {
        System.out.println(solve(11, 13));
        System.out.println(solve(12, 36));
        System.out.println(solve(12, 13));
    }
}
