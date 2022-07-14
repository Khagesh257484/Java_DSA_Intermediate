/*
Q5. Find nth Magic Number
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….



Problem Constraints
1 <= A <= 5000



Input Format
The only argument given is integer A.



Output Format
Return the Ath magic number.



Example Input
Example Input 1:

 A = 3
Example Input 2:

 A = 10


Example Output
Example Output 1:

 30
Example Output 2:

 650


Example Explanation
Explanation 1:

 Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 3rd element in this is 30
Explanation 2:

 In the sequence shown in explanation 1, 10th element will be 650.



See Expected Output
Your input
7
Output
155
* */

package com.dsa.intermediate.math;

/*
(Taking Binary of number 1,2 ,3,4 & Multiplying with power same as we do in binary with base 2)
Here base is 5

 A=1(001) : 5^1 = 5
 A=2(010) : 5^2 = 25
 A=3(011) : 5^1+5^2=30
 A=4(100) : 5^3 = 125

 So from here we can find binary of number with base 5

* */
public class NthMagicNumber {
    public static int solve(int A) {
        int base = 5, ans = 0;
        while (A > 0) {
            int rem = A % 2;
            ans += rem * base;
            base = base * 5;
            A /= 2;
        }
        return ans;
    }

    public static int solve2(int A) {
        int ans=0, power=1;
        while(A!=0){
            power*=5;
            if(((int)A&1)==1){  // if bit is set then only do operation , for ex : 101 : 1*5^2+0*5^1+1*5^0
                ans+=power;
            }

            A>>=1;  // That is nothing but A/=2;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(solve(10));
        System.out.println(solve(4));
    }
}
