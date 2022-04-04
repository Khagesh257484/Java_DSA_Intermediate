package com.dsa.intermediate.array.prefix;

public class EquilibriumIndex {
    public int bruteForce(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int f = i, k = i, last = n - 1, left = 0, right = 0;
            while (f > 0) {
                left += A[f - 1];
                f--;
            }
            while (k < last) {
                right += A[k + 1];
                k++;
            }
            if (left == right) {
                return i;
            }

        }

        return -1;
    }

    public int usingPrefixSum(int[] A) {
        /*
         1) First create the prefix sum but ques is that how can we check prefix sum
             So what was the logic in brute force , that was if left sum=right sum then it is eql index.
             leftSum+RightSum=TotalSum

         2) Same logic we will apply here.
            find left sum : ps[i]-A[i]
                 totalSum=ps[n-1];
                 right sum : totalSum-ps[i]

        **/
        int n = A.length;
        int[] ps = new int[n];

        for (int i = 0; i < n; i++) {  // Will give prefix sum
            if (i == 0)
                ps[i] = A[i];
            else
                ps[i] = ps[i - 1] + A[i];
        }

        int totalSum = ps[n - 1];
        for (int i = 0; i < n; i++) {
            int leftsum = ps[i] - A[i];
            int righSum=totalSum-ps[i];
            if(leftsum==righSum)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        EquilibriumIndex ei = new EquilibriumIndex();
        int[] a = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(ei.usingPrefixSum(a));

        int[] b = {0, 1, 3, -2, -1};
        System.out.println(ei.usingPrefixSum(b));

        int[] c = {1, 2, -2, -1};
        System.out.println(ei.usingPrefixSum(c));

        int[] d = {1, 2, 5, 4, -1, -1, -2, 5, -1, 2, 12, -6};
        System.out.println(ei.usingPrefixSum(d));

    }
}
