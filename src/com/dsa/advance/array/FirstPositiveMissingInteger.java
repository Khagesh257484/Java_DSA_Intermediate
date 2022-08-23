package com.dsa.advance.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
First Missing Positive Integer
====================================

  In a given array, you have to find the first missing positive integer

	Ex : 3, 4, -1, 1 , ans : 2


Observation 1:

 1)  3, 4, -1, 1 ,

  -> If you sort given arraylist & start loop from 1, you can check that in arraylist we have one method contains if any element is not present that means it is first missing Integer.

  -> Time complexity of ArrayList contains method is : O(N).
    The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. All of the other operations run in linear time (roughly speaking). The constant factor is low compared to that for the LinkedList implementation.

    http://download.oracle.com/javase/6/docs/api/java/util/ArrayList.html


----------------
Observation 2:
----------------
  -> First check how many number is greater than 0 (count)

  -> Create a boolean array of(count+1) length and fill all value as false.

  -> now iterate main array and check if any number is greater than 0 then mark it as true in boolean array

  -> Now iterate boolean array & check which value is false, false value will be answer , if you did not get any false value the your last value will be answer.


  Time & Space Complexity :
  Hence we are doing seperate operations so it will take O(N) time & we are creating an extrea array of boolean type so it will be O(N).


----------------------
  Observation 3 :
----------------------
    -> Solve with O(N) time complexity and O(1) Space Complexity.
* */
public class FirstPositiveMissingInteger {

    // https://www.algostreak.com/post/first-missing-integer-interviewbit-solution
    // 3, 4, -1, 1
    // Using arrayList but taking high time complexity
    public static int missingIntegerArrayList(ArrayList<Integer> al) {
        if (al.size() == 0)
            return 1;

        // Sort Array : Sorting takes O(NlogN) time
        Collections.sort(al);
        System.out.println(al);

        // Start loop from 1
        int i;
        for (i = 1; i < al.size(); i++) {   // In worst case loop can run till length that means will take O(N)
            if (!al.contains(i))     // this contains method will also take O(N)
                return i;
        }
        return i + 1;

        // So total time complexity will be O(N^2LogN), which is not satisfying.
    }


    // Reducing time complexity. O(N) & SC : O(N)
    public static int missingInteger_Optimize1(int[] A) {
        // check how many positive number is present in array
        int pos = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0)
                pos++;
        }

        // Create a boolean array with false value of pos size.
        boolean[] posArray = new boolean[pos + 1];
        Arrays.fill(posArray, false);

        // fetch main array and mark value true for positive value in boolean array.
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= pos) {
                posArray[A[i]] = true;       // updating value if condition satisfied
            }
        }

        // fetch boolean array from 1 to till pos and check if any element in boolean array is false then return
        // it as answer otherwise last+1 value will be the answer (pos+1)
        for (int i = 1; i <= pos; i++) {
            if (!posArray[i])  // if not present
                return i;
        }
        return pos + 1;
    }

    //

    public static void main(String[] args) {
        //  ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-6, -7, 3, 4, -1, 2, 1));
        // System.out.println(missingIntegerArrayList(al));

        int[] a = {3, 4, -1, 1, 5};
        System.out.println(missingInteger_Optimize1(a));


    }
}
