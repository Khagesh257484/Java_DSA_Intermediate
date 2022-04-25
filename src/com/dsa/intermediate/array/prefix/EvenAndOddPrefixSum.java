package com.dsa.intermediate.array.prefix;

import java.util.Arrays;

public class EvenAndOddPrefixSum {

    public int[] prefix_even(int[] A) {
        int n = A.length;
        int[] psEven = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                psEven[i] = A[0];
            else if (i % 2 == 0)
                psEven[i] = psEven[i - 1] + A[i];
            else
                psEven[i] = psEven[i - 1];
        }
        return psEven;
    }

    public int[] prefix_odd(int[] A) {
        int n = A.length;
        int[] psOdd = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                psOdd[0] = 0;
            else if (i % 2 != 0)
                psOdd[i] = psOdd[i - 1] + A[i];
            else
                psOdd[i] = psOdd[i - 1];

        }
        return psOdd;
    }

    public static void main(String[] args) {
        EvenAndOddPrefixSum eoSum=new EvenAndOddPrefixSum();
        int[] a = {2,3,1,6,4,5};
        System.out.println("Actual Array is ::::  "+Arrays.toString(a));

        int[] ps=new int[a.length];
        // Creating prefix sum of given array
        for(int i=0;i<a.length;i++){
          if(i==0)
              ps[i]=a[i];
          else
              ps[i]=ps[i-1]+a[i];
        }

        System.out.println("Prefix Sum ::::  "+Arrays.toString(ps));
        System.out.println("Prefix Even Indices Sum ::::  "+Arrays.toString(eoSum.prefix_even(a)));
        System.out.println("Prefix Odd Indices Sum  ::::  "+Arrays.toString(eoSum.prefix_odd(a)));
    }
}
