package com.dsa.intermediate.math;
/*
Problem Description
You are given two non-negative integers, A and B. Find the value of the Least Common Multiple (LCM) of A and B.
LCM of two integers is the smallest positive integer divisible by both.

Problem Constraints
1 <= A, B <= 1000


Input Format
The first argument is an integer A.
The second argument is an integer B.


Output Format
Return an integer.

Example Input
Input 1:
 A = 2
 B = 3

Input 2:
 A = 9
 B = 6

Input 3:
 A = 2
 B = 6


Example Output
Output 1:
 6

Input 2:
 18

Input 3:
 6


Example Explanation
Explanation 1:
 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).

Explanation 2:
 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).

Explanation 3:
 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).


* */

/*
  a*b=lcm(a,b)*gcd(a,b);

  lcm(a,b)=a*b/gcd(a,b)

* */
public class LcmOfTwoNumbers {
    public int LCM(int A, int B) {
        int gcd=gcd(A,B);
        return (A*B)/gcd;
    }

    public int gcd(int A, int B) {
        int r = A % B;
        while (r != 0) {
            A = B;
            B = r;
            r = A % B;
        }
        return B;
    }


    public static void main(String[] args) {

        LcmOfTwoNumbers lcm = new LcmOfTwoNumbers();
        System.out.println(lcm.gcd(24,36));
        System.out.println(lcm.LCM(24, 36));
    }
}
