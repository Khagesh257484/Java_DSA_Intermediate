/*
 Question 1 : In a given array, count most consecutive one

 Question 2 : In a given array, count most consecutive ones after flipping zero, you can flip at most one zero
* */

package com.dsa.advance.array;

public class ConsecutiveOnesByFlip {

    public static int countConsecutiveOnesByFlip(int[] arr) {
        int maxConsOnes = 0, start = 0, zeroCount = 0;
        int k = 1; // this variable represents that we can flip only one zero, if any zeroCount > k then will not flip

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeroCount++;

            while (zeroCount > k) {
                if (arr[start] == 0)
                    zeroCount--;
                start++;
            }
            maxConsOnes = Math.max(maxConsOnes, i - start + 1);   // i=end
        }
        return maxConsOnes;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0};
        System.out.println(countConsecutiveOnesByFlip(a));

    }
}
