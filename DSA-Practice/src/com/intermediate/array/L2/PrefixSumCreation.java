/*
  For a given array find the sum between 2 indices in given array .

  int[] arr={2,5,4,3,7}

  indices : 0 to 3, 1 to 4, 2 to 3
  and return an array of these sum.

* */

package com.intermediate.array.L2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrefixSumCreation {

    List<Integer> sumList = new ArrayList<>();

    public void indicesSumArray(int[] arr, int start, int end) {
        int sum = 0;
        if (start == 0) {
            sum = arr[end];
            sumList.add(sum);
        } else {
            for (int i = start; i <= end; i++) {
                sum = arr[end] - arr[start - 1];
            }
            sumList.add(sum);
        }

    }

    public int[] prefixSum(int[] arr) {
        int[] prefSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                prefSum[0] = arr[0];
            } else {
                prefSum[i] = prefSum[i - 1] + arr[i];
            }
        }
        return prefSum;
    }

    public static void main(String[] args) {
        PrefixSumCreation pfs = new PrefixSumCreation();
        int[] arr = {3, 2, 4, 6, 8, 5, 7};

        int[] prefix = pfs.prefixSum(arr);

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            pfs.indicesSumArray(prefix, start, end);
        }

        System.out.println(pfs.sumList);

    }

}
