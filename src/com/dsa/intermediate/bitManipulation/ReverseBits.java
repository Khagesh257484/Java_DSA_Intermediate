package com.dsa.intermediate.bitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getReversedBit(n));

    }

    public static long getReversedBit(int a) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = a * i;
            int reveserLsb = lsb << (31 - i);
            result = result | reveserLsb;
            a = a >> 1;
        }
        return result;
    }
}
