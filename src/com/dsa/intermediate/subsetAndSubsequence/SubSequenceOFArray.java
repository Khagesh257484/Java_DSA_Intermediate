package com.dsa.intermediate.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.Collections;

public class SubSequenceOFArray {

    public static ArrayList<ArrayList<Integer>> printSubSeq(int[] A){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i=0;i<A.length;i++){
            ArrayList<Integer> currList=new ArrayList<>(A[i]);

        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> printSubsequences(int[] A) {
        ArrayList<ArrayList<Integer>> subseqList = new ArrayList<>();
        int n = A.length;
        for (int i = 0; i < Math.pow(2, n) - 1; i++) {
            ArrayList<Integer> elementList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // al.add(A[j]); // This will not work, add only those elements which has tick, to perform this below code is written
                if ((i & (1 << j)) != 0) {
                    elementList.add(A[j]);
                }
            }
            subseqList.add(elementList);
        }
        return subseqList;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(printSubsequences(a));

    }
}
