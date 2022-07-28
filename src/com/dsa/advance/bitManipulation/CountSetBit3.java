package com.dsa.advance.bitManipulation;

public class CountSetBit3 {

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
    int findPower(int A) {
        // Find power of 2 which is less than A
        int x = 0;
        while ((1 << x) <= A)
            x++;
        return x - 1;
    }

    int mod = 1000000007;

    int solve(int A) {
        if (A <= 1)
            return A;
        int x = findPower(A);
        int n = (x * (int) Math.pow(2, (x - 1))) + (A - (int) Math.pow(2, x) + 1)
                + solve(A - (int) Math.pow(2, x));
        return (int) n % mod;
    }


    public static void main(String[] args) {
        CountSetBit3 csb = new CountSetBit3();
        System.out.println(csb.solve(3));
        // System.out.println(csb.countSetBit(1));
    }
}
