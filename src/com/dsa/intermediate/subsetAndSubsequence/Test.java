package com.dsa.intermediate.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < Math.pow(2, A.size()); i++) {
            ArrayList<Integer> eles = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                if ((i & (1 << j)) != 0) {
                    eles.add(A.get(j));
                }
            }
            answer.add(eles);
        }
        return answer;
    }

    public static int sum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < Math.pow(2, A.size()); i++) {
            int sum = B;
            for (int j = 0; j < A.size(); j++) {
                if ((i & (1 << j)) != 0) {
                    sum = sum - A.get(j);
                }
            }
            if (sum == 0)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(subsets(al));
    }
}
