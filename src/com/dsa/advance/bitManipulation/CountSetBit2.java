package com.dsa.advance.bitManipulation;

public class CountSetBit2 {

    // This is basic approach will take O(n^2) time.

/*

    long countSetBit(int A) {
        long count = 0;
        while (A > 0) {
            if ((A & 1) == 1) {
                count++;
            }
            A = A >> 1;
        }
        return count;
    }

    public int solve(int A) {
        long sum = 0;
        long mod = 1000000007;
        for (int i = 1; i <= A; i++) {
            sum += countSetBit(i);
        }
        return (int) (sum);
    }
*/


    // Optimized Approach

    /*

     * */
    public int findLargestPower(long n) {
        int x = 0;
        while ((1 << x) <= n)
            x++;
        return x - 1;
    }

    long mod = 1000 * 1000 * 1000 + 7;

    public int solve(int A) {
        long n = (long) (A);
        if (n == 0)
            return 0;
        long x = findLargestPower(n);
        long p = (long) Math.pow(2, x);
        p = p % mod;
        long p1 = (long) Math.pow(2, (x - 1));
        p1 = p1 % mod;
        long x1 = (x * p1);
        long x2 = ((n - p + 1));
        x1 = x1 % mod;
        long y1 = (long) (solve((int) n - (int) p));
        y1 = y1 % mod;
        x2 = x2 % mod;
        long k = x1 + y1 + x2;
        if (k <= 0) {
            k = (k + mod);
        }
        //System.out.println(k);
        return (int) (k % mod);
    }


    public static void main(String[] args) {
        CountSetBit2 csb = new CountSetBit2();
        System.out.println(csb.solve(3));
        // System.out.println(csb.countSetBit(1));
    }
}
