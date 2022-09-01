package com.dsa.advance.sorting;

// Hashmap Approach :
/*
Appraoch 1 : Using HashMap

 // 2 4 3 4 5 3

 1) create frequency Hashmap & count =0;
    2 : 1
	3 : 2 count=1;
	4 : 2
	5 : 1   As per question, we can increment by one, if any elemeny which has freq > 1 then we can increment by one, so traverse the element on HashMap

	1) If any element has freq 1 then no need to perform operation.

	2) If any element has freq > 1 then need to do something cause it is not unique element in array.

	   Operation : Increment the value by one and decrement freq by one

				2 : 1
				3 : 1 , value increase by 1 and fre decrease by 1 ,We also need to count that how many steps need
				4 : 3   to perform, initially count=0; & we performed one operation so count will increment by one
				5 : 1 	if we perform 2 operation then count will increment by 2

                        count+= No of operation performed to make freq 1 of any element
               count=3

	3)
	    2 : 1
		3 : 1
		4 : 1
		5 : 3
	4)
	   	2 : 1
		3 : 1
		4 : 1
		5 : 1
		6 : 2  count=5

	5)
		2 : 1
		3 : 1
		4 : 1
		5 : 1
		6 : 1 count=6
		7 : 1

* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// O(1) Space solution Approach
public class UniqueElements {

    // https://leetcode.com/problems/minimum-increment-to-make-array-unique/solution/

    static int unique(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){

            }
        }
        return 0;
    }

    static int unique2(int[] A){
        Arrays.sort(A);
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                sum += A[i - 1] - A[i] + 1;
                A[i] = A[i - 1] + 1;
            }
        }
        return sum;
    }

    public int solve(int[] A) {
        int n = A.length;
        // sort the array
        Arrays.sort(A);
        // initialize variables
        int steps = 0, i = 1, j = 0;
        // loop unitil you reach the end
        while (j < n) {
            // make current element unique
            if (i >= A[j]) {
                steps += (i - A[j++]);
                i += 1;
            } else {
                i = A[j] + 1;
                j += 1;
            }
        }
        // return the answer
        return steps;
    }

    public static void main(String[] args) {
        int[] a={1,1,2,3,2};
        System.out.println(unique2(a));
    }
}
