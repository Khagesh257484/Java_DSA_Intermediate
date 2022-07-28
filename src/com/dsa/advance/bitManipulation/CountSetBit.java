package com.dsa.advance.bitManipulation;

public class CountSetBit {

    static int setBit(int A) {
        int count = 0;
        while (A > 0) {
            if ((A & 1) == 1) {
                count++;
            }
            A = A >> 1;   // It is shifting bit by one to right side after converting number in binary
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(setBit(3));
        System.out.println(setBit(2));
    }
}
