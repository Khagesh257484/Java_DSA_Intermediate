/*
Q3. Prime Addition
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
You are given an even number N and you need to represent the given number as the sum of primes. The prime numbers do not necessarily have to be distinct. It is guaranteed that at least one possible solution exists.

You need to determine the minimum number of prime numbers needed to represent the given number.

Input

The first argument contains an integer N,the number you need to represent (2<=N<=10^9).
Output

Return an integer which is the minimum number of prime numbers needed to represent the given number N.
Examples

Input

26
Output

2
Explanation

Testcase 1-

You can represent 26 as: 13+13
So we require minimum of 2 prime numbers to represent the number 26.

* */


// Question has different cases then approach but Approach will be same like as below approach.

/*
Approach:
For the minimum number of primes whose sum is the given number N, Prime Numbers must be as large as possible.
Following are the observation for the above problem statement:

Case 1: If the number is prime, then the minimum primes numbers required to make sum N is 1.
Case 2: If the number is even, then it can be expressed as a sum of two primes as per the Goldbach’s Conjecture for every
even integer greater than 2. Therefore the minimum prime number required to make the sum N is 2.
Case 3: If the number is odd:
 1) If (N-2) is prime, then the minimum prime number required to make the given sum N is 2.
 2) Else The minimum prime numbers required to make the given sum N is 3 because:

As N is odd, then (N - 3) is even.
Hence As per case 2:
   1) The minimum prime number required to make the sum (N-3) is 2.

   2) Therefore, The minimum prime number required to make the sum N is 3(2+1).

Below are the steps:
 1) Check whether the given number N is prime or not, by using the approach discussed in this article. If Yes then print 1.
 2) Else as per the above Cases print the minimum number of Prime Numbers required to make the given sum N.

* */
package com.dsa.advance.math.primenumbers;

public class PrimeAddition {
    boolean isPrime(int A) {
        boolean flag = true;
        for (int i = 2; i < A; i++) {
            if (A % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            return true;
        else
            return false;
    }

    public int solve(int A) {
        int minCount;

        if(A==2)
            return 1;

        // Case 1: If A is prime then it will equal only itself
        if (isPrime(A)) {
            return minCount = 2;
        }

        // Case 2: If A is not prime or even number then we know that 2 prime number sum will be even
        else if (A % 2 == 0) {
            return minCount = 2;
        }

        // Case 3: If A is odd
        // If(A-2) is prime then return 2
        else if (A % 2 != 0) {
            return minCount = 2;
        } else
            return 2;
    }

}
