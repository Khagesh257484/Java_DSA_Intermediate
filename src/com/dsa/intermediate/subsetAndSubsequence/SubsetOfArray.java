package com.dsa.intermediate.subsetAndSubsequence;

import java.util.*;

public class SubsetOfArray {

    /*
     *   [1, 2, 3] = [] [1] [2] [3] [1,2] [1,2,3],[2,3]
     *
     * Iterative Approach :

     * Add empty set in list
     * copy or pick element or subset from result list, after copy add number in list then again add in result list


     * */


    // Iterative Approach
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();    // Power set or declaring an array list will store all subset of an array
        // in a subset we can have empty subset, so will take an empty list which will return empty subset and add in result list
        result.add(new ArrayList<>());
        for (int i = 0; i < A.size(); i++) {
            int n = result.size();  // initially this list has size of one, so loop will run one time initially
            for (int j = 0; j < n; j++) {
                // copy element from result list : to copy in list have to make a new list in each iteration
                ArrayList<Integer> curr = new ArrayList<>(result.get(j));    // in first iteration, it will get empty set

                // add number(array element) in list
                curr.add(A.get(i));         // add one from array [1]

                // then subset will make and add these subsets in the result list
                result.add(curr);    // [] [1]

            }
        }

        Collections.sort(result, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if (o1.size() > 0 && o2.size() > 0) {
                    for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                        if (o1.get(i) != o2.get(i))
                            return o1.get(i) - o2.get(i);
                    }
                }
                return 0;
            }
        });

        return result;
    }


    // Using Bit Manipulation
    public ArrayList<ArrayList<Integer>> printSubSet(ArrayList<Integer> A) {
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

        Collections.sort(answer, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if (o1.size() > 0 && o2.size() > 0) {
                    for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                        if (o1.get(i) != o2.get(i))
                            return o1.get(i) - o2.get(i);
                    }
                }
                return 0;
            }
        });

        return answer;
    }

    public static void main(String[] args) {
        SubsetOfArray set = new SubsetOfArray();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(12, 13));
        System.out.println(set.subsets(al));

        int[] a = {1, 2, 3};
        System.out.println(set.printSubSet(new ArrayList<>(Arrays.asList(1,2,3))));
    }
}
