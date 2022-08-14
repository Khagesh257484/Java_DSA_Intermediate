/*
Q2. Largest Coprime Divisor
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given two positive numbers A and B . You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1


Problem Constraints

1 <= A, B <= 109



Input Format

First argument is an integer A.
Second argument is an integer B.



Output Format

Return an integer maximum value of X as descibed above.



Example Input

Input 1:

 A = 30
 B = 12
Input 2:

 A = 5
 B = 10


Example Output

Output 1:

 5
Output 2:

 1


Example Explanation

Explanation 1:

 All divisors of A are (1, 2, 3, 5, 6, 10, 15, 30).
 The maximum value is 5 such that A%5 == 0 and gcd(5,12) = 1
Explanation 2:

 1 is the only value such that A%5 == 0 and gcd(1,10) = 1
* */

/*
 Approach : As per question we need co prime gcd that means need to find co prime factor of A & B and remove common factor from this
           & Remaining will be same.

    A: 30  -> All Factor of 30 :: 1,2,3,5,6,15,30
    B: 12  -> All factor of 12 :: 1 2 3 4 6 12

   First Approach :
          you can traverse all factors of A,exclude 1 & check with value of B
          For ex : gcd(2,12) : 2
                   gcd(3,12) : 3
                   ...
                   gcd(5,12) : 1 , condition satisfied then return A

                   Here you can Observe that value of A is changing.

 Second Approach :
             if A%X=0 that means X is one Factor of A , so it can be written as
                 X=A/K;  A=KX
                 K=A/X=0

            A=p^a * p^b * p^c  :: Here p is prime factor of A and a b c is power of prime factor

       So  A & B can be written as below

       30 : 2^1 * 3^2 * 5^1
       12 : 2^1 * 3^2
         Remove common factor and check gcd(5,12) will be 1 and ans will be 5



* */
package com.dsa.advance.math.gcd;

public class LargestCoprimeDivisior {

    // Iterative Approach
    public static int cpFact(int A, int B) {
        while (gcd(A, B) != 1) {
            A = A / gcd(A, B);
        }
        return A;
    }

    static int gcd(int A, int B) {
        /*if (A == 0)
            return B;
        return gcd(B % A, A);*/
        if (B == 0) return A;
        return gcd(Math.min(A, B), Math.max(A, B) % Math.min(A, B));
    }

    // Recursive Approach
    static int gcdCp(int a, int b)
    {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcdCp(a - b, b);
        return gcdCp(a, b - a);
    }

    static int cpFactRec(int x, int y)
    {
        while (gcdCp(x, y) != 1) {
            x = x / gcdCp(x, y);
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(cpFact(30, 12));
        System.out.println(cpFactRec(30, 12));
    }
}
