package com.dsa.intermediate.array.prefix;
/*
Ques : You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Input : A = [1, 2, 3, 4, 5]
       B = [[1, 4], [2, 3]]

Output : [10, 5]

Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
1 <= L <= R <= N

 From Problem Constraints, We can check that Left index is starting from one not zero so it is one based indexing.

Solution :
1) Create prefix sum array for given array.

2)  then find sum between starting and ending point [s,e]
    sum[s,e]=ps[e]-ps[s-1];

* */

import java.util.Arrays;

public class RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
        int m=A.length;
        int n=B.length;

        // Instead of int if I declare long then will not get TLE but why ?
        int[] ps=new int[m]; // Creating Prefix sum array
        ps[0]=A[0];
        for(int i=1;i<m;i++){
            ps[i]=ps[i-1]+A[i];  // Calculating prefix sum
        }
        long[] ans=new long[n];

        // As per problem, indexing should start from one,but we are starting from 0, so we have to subtract 1
        for(int i=0;i<n;i++){
            int s=B[i][0]-1;  // first element
            int e=B[i][1]-1;  // Second element
            ans[i]=ps[e];
            if(s>0){ // sum[s,e]= ps[e] -ps[s-1];   // Formula to get sum between s and e
                ans[i] =ans[i]-ps[s-1];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        RangeSumQuery rangeSumQuery = new RangeSumQuery();
        int b[] = {1, 2, 3, 4, 5, 6};
        int[][] a = {{2, 3}, {1, 2}};
        long[] ans = rangeSumQuery.rangeSum(b,a);
        System.out.println(Arrays.toString(ans));



    }
}
