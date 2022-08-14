package com.dsa.advance.math.primenumbers;

import java.util.Arrays;

/*
 find out prime number between 1 to 12

 -> 1 is non-prime number so should always start from 2
 -> from 2 to n : 2 ,3,5,7,11 is prime number
* */
public class SeiveAlgo {
    static boolean[] sieveAlgoImpl(int n) {
        // Make one boolean array  and mark it all elements of this boolean array is true, all is prime
        // Creating array of length(n+1) cause in array indexing is start from the 0, so there is one extra element in array length
        // that's why we are creating the array of (n+1)
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, Boolean.TRUE);  // Mark boolean Array is true
        isPrime[0] = false;
        isPrime[1] = false;

        // to find out prime number we already know that iterate till √(root) n, if you get any factor till √n then number will not
        // prime otherwise prime

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true)  // If will not use then does not effect
                for (int j = 2 * i; j <= n; j += i) {
                    // Inner loop is for checking multiple of the 2 and 3.... and j+=i , suppose initially j=2 then j+i=4,6,8,
                    // if initially j=3 then j+i=3,6,9,12 ..
                    // So if number is multiple of another number that means it will not be a prime number and mark it false

                    isPrime[j] = false;

                }
        }
        return isPrime;

    }

    // because lesser no have taken care of their divisors

    public static void main(String[] args) {
        boolean[] isPrime = sieveAlgoImpl(20);
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == true)
                System.out.println(isPrime[i] + " :: " + i);
        }


    }
}
