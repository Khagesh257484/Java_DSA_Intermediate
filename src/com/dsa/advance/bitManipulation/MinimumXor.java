/*
Q3. Smallest XOR
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two integers A and B, find a number X such that A xor X is minimum possible, and the number of set bits in X equals B.



Problem Constraints
0 <= A <= 109
0 <= B <= 30



Input Format
First argument contains a single integer A. Second argument contains a single integer B.



Output Format
Return a single integer X.



Example Input
Input 1:

 A = 3
 B = 3
Input 2:

 A = 15
 B = 2


Example Output
Output 1:

 7
Output 2:

 12


Example Explanation
Explanation 1:

 3 xor 7 = 4 which is minimum
Explanation 2:

 15 xor 12 = 3 which is minimum
* */

// Approach

/*

A=3 & B= 3
x=?

Brute Force :

1) we can do it using brute force approach, for this we have to run loop from 1 to 10^9 and check for every number that which is minimum. It is very time taking approach so we can't do this in way.


Approach 2 :

1) We need to find value of x like that set bit in X count should equal to set bit count in B

2) as per question we need minimum value of A^X, so my x value will vary arround value of A. So we should try arround A value.

Algo :

1) check or find set bit count of number
    int bitA=Integer.bitCount(A);
	int bitB=Integer.bitCount(B);

   if(bitA==bitB){
	return A;
  }

2) if(bitA>bitB)
	-> A has more bit so reduce it bit cause we want a number x which set bit count should equal to B. So to do that remove LSB(Right side bit)  from A
    while(bitA > bitB)
	{
     A=A&(A-1);    // decreasing set bit count
	}


3) if(bitA < bitB)
   {
	while(bitA < bitB)
	{
	 A=A|(A+1);
	}
   }



* */

package com.dsa.advance.bitManipulation;

public class MinimumXor {
    // https://www.youtube.com/watch?v=9AssoQhH5IQ

    public static int solve(int A, int B) {
        int bitA = Integer.bitCount(A);
        int bitB = Integer.bitCount(B);
        int diff = Math.abs(bitA - bitB);

        // if both bit equal then return A;
        if (diff == 0)  // bitA == bitB
            return A;
        else if (bitA > bitB) {  // bitA > bitB
            while (diff > 0) {
                A = A & (A - 1);  // reducing bit
                diff--;
            }
        } else {     // bitA < bitB
            while (diff < 0) {
                A = A | (A + 1);
                diff++;
            }

        }
        return A;
    }

    // Second way
    public int solve2(int A, int B) {
        int x = 0;
        for (int i = 30; i >= 0; i--) {
            if (B == 0)
                return x;
            if (((1 << i) & A) > 0) {
                x |= (1 << i);
                B--;
            }
        }

        for (int i = 0; i <= 30; i++) {
            if (B == 0)
                return x;
            if (((1 << i) & x) == 0) {
                x |= (1 << i);
                B--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(solve(3, 3));
        System.out.println(solve(7, 5));
        System.out.println(solve(11,2));
    }
}
