package com.dsa.advance.bitManipulation;

import java.util.Arrays;

public class SingleNumber2 {
    public static int singleNumber_Bruteforce(final int[] A) {
        int n = A.length, element = 0;
        for (int i = 0; i < n; i++) {
            int count1 = 0; // to find out how many time value is appeared in the arry
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    // if(arr[i] == 1 ) {
                    count1++; //
                }
            }
            if (count1 == 1) {
                // System.out.print(A[i] + " ");// 6 7 8 uniqe
                element = A[i];
            }
        }
        return element;
    }


    static int singleNumber_Opt(final int[] A) {
        int n = A.length, sum = 0;

        // create freq array to store
        int[] freq = new int[32];

        // 6 5 8 7 7 8 8 5 2 5 6 6 7
        for (int i = 0; i < n; i++) {
            int j = 0;
            // Extract every bit of number and store or add it to sum at correct index is maintained by j
            while (A[i] > 0) {
                int last_bit = (A[i] & 1);   // It wll 0 and 1  // A[0]=6=110 & last bit is zero
                // We are iterating last bit from right to left but in freq array will go from left to right
                if (last_bit == 1) {
                    freq[j]++;
                }
                // In freq array first 0 will store then 1 & 1, so 110 will become 011
                j++;
                A[i] = A[i] >> 1;   // Removing last bit by shifting one bit to the right
            }
        }
        //System.out.println(Arrays.toString(freq));

        // Iterate over the freq array to generate number
        int power = 1, ans = 0;
        for (int x : freq) {
            ans = ans + (x % 3) * power;
            power = power << 1;
        }

        return ans;
    }

    public static int decToBinary(int n) {
        String s = "";
        // Size of an integer is assumed to be 32 bits
        for (int i = 31; i >= 0; i--) {

            int k = n >> i;
            if ((k & 1) > 0)
                s = s.concat("1");
            else
                s = s.concat("0");
        }
        // System.out.println(s);
        int res = Integer.parseInt(s);
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 14, 1,3,1,3,3};
        System.out.println(singleNumber_Opt(A));

        // System.out.println(101 + 1000 + 0 + 101);

    }
}
