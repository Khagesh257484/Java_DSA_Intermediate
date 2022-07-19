/*

* */

package com.dsa.advance.array;

public class EquilibriumIndex {
    public int bruteForce(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int f = i, k = i, last = n - 1, leftSum = 0, rightSum = 0;
            while (f > 0) {
                leftSum += A[f - 1];
                f--;
            }
            while (k < last) {
                rightSum += A[k + 1];
                k++;
            }
            if (leftSum == rightSum) {
                return i;
            }

        }

        return -1;
    }

    // Equilibrium index using prefix sum, Optimized way to solve it
    public static int solev(int[] A) {
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
            int righSum = totalSum - ps[i];
            if (leftsum == righSum)
                return i;
        }

        return -1;
    }




    public static void main(String[] args) {
        int[] a = {-7, 1, 5, 2, -4, 3, 0};
        int[] b = {1, 2, 3};
        int[] c = {20, 10, 8, 12, 6, 11, 1};

        System.out.println(solev(a));
        System.out.println(solev(b));
        System.out.println(solev(c));
    }
}
