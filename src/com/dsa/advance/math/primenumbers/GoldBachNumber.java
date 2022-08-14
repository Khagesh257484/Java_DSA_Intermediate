/*
  1) As we know that if we add 2 odd number than sum will be even of both numbers. 11+13=24, 27+21=48
      And you can observe that there is no even prime number except 2 in number theory.

  GoldBach Number : A Goldbach number is a positive integer that can be expressed as the sum of two odd primes.
                    Since four is the only even number greater than two that requires the even prime 2 in order to be written as the
                    sum of two primes, but 2 is even prime & we need odd prime.

               ->   Another form of the statement of Goldbach’s conjecture is that all even integers greater than
                    4 are Goldbach numbers.
* */


/*
 Question : Given a number N, where 9<N<50, Find all odd prime numbers pairs whose sum is equal to the N
* */

/*
 Observation : 1) First we need to find all prime numbers between 2 to N, We can use brute force or Sieve Algo
* */
package com.dsa.advance.math.primenumbers;

import java.util.Arrays;
import java.util.HashMap;

public class GoldBachNumber {
    static boolean[] findPrimes(int n) throws Exception {
        if (n <= 2 || n % 2 != 0) {
            throw new Exception("Invalid Input");
        }

        //Sieve Algo
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, Boolean.TRUE);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true)
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
        }

        // Hashmap : Storing prime number in HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true)
                map.put(i, i);
        }
        System.out.println(map);

        return isPrime;
    }

    public static void main(String[] args) throws Exception {
        int n = 26;
        boolean[] prime = findPrimes(26);
        System.out.println("***** Below is all Prime number between 1 to " + n+" **********");
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == true)
                System.out.println(i + " : " + prime[i]);
        }
        System.out.println(findPrimes(23));
    }
}
