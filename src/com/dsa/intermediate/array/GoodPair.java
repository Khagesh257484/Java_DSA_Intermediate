package com.dsa.intermediate.array;

/*
 Question : Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

Input Format :
    First argument is an integer array A.
    Second argument is an integer B.

Output Format :
Return 1 if good pair exist otherwise return 0.

ex: A = [1,2,3,4]
    B = 7
     sum of element 3 and 4 is equal to the 7 that means good pair exits, return 1 else return 0

* */
public class GoodPair {

    public static int solve(final int A[], int B) {
        int n = A.length, i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i != j && A[i] + A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
      /*  int a[] = {3, 4, 1, 2};
        int b = 7;
        int first = solve(a, b);
        System.out.println(first);

        int a1[] = {1, 2, 4};
        int b1 = 4;
        int second = solve(a1, b1);
        System.out.println(second);*/

      /*  int a2[]={510827, 351151, 96897, 925335, 299818, 192489, 456948, 44720, 510589, 598577};
        int b2=808099;
        int third=solve(a2,b2);
        System.out.println(third)*/
        ;

        int a3[] = {2, 3, 4, 6, 7, 9};
        int b = 6;
        System.out.println(solve(a3, b));
    }
}
