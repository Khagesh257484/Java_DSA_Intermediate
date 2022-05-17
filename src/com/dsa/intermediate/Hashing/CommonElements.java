package com.dsa.intermediate.Hashing;

import java.util.*;

/*
Q1. Common Elements
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation
Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explantion 2:

 Elements (2, 10) appears in both the array.
* */
public class CommonElements {
/*
  Ideas:
   a) HashSet does not contain the duplicate elements so use hashSet
   b) Can create 2 HashSet and Match both Hashset Elements
   c) Can create one HashSet & iterate second array to check that array element is present in HashSet or not ( This is more efficient )

   Note : If you want only unique common element then only go with hashset because it does not maintain the frequency and if you want
   with all elements then go with Hash map.

* */

    public int[] twoHashSet(int[] A, int[] B) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding first array element in set1
        for (int i = 0; i < A.length; i++) {
            set1.add(A[i]);
        }

        // Adding second array element in set2
        for (int i = 0; i < B.length; i++) {
            set2.add(B[i]);
        }

//        System.out.println(set1);
//        System.out.println(set2);
        // retainAll() method to check common element in HashSet
        set1.retainAll(set2);
        // System.out.println(set1);
        int[] arr = new int[set1.size()];
        int i = 0;
        for (Integer x : set1)
            arr[i++] = x;

        return arr;
    }

    public ArrayList<Integer> withHashmap(ArrayList<Integer> A, ArrayList<Integer> B) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        // Filling Array data in Freq Map
        for (int i = 0; i < A.size(); i++) {
            if (freqMap.containsKey(A.get(i))) {
                int value = freqMap.get(A.get(i));
                int newValue = value + 1;
                freqMap.put(A.get(i), newValue);
            } else {
                freqMap.put(A.get(i), 1);
            }
        }

        // Now checking Second Array value with Freq Map.
        for (int i = 0; i < B.size(); i++) {
            if (freqMap.containsKey(B.get(i)) && freqMap.get(B.get(i)) > 0) {
                al.add(B.get(i));
                int value = freqMap.get(B.get(i));
                int newValue = value - 1;
                freqMap.put(B.get(i), newValue);

            }
        }

        //
        return al;

    }


    // Another Way
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int elem:A){
            if(hm.containsKey(elem)){
                hm.put(elem,hm.get(elem)+1);
            }else {
                hm.put(elem,1);
            }
        }


        for(int elem:B){
            if(hm.containsKey(elem) && (hm.get(elem)!=0)){
                hm.put(elem,hm.get(elem)-1);
                arr.add(elem);

            }
        }

        return arr;
    }

    public static void main(String[] args) {
        CommonElements elements = new CommonElements();
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};

        ArrayList<Integer>al1=new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer>al2=new ArrayList<>(Arrays.asList(2, 3, 1, 2));
        System.out.println(elements.withHashmap(al1,al2));
    }
}
