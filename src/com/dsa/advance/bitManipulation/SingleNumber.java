/*
Q1. Single Number
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?



Problem Constraints
2 <= |A| <= 2000000

0 <= A[i] <= INTMAX



Input Format
The first and only argument of input contains an integer array A.



Output Format
Return a single integer denoting the single element.



Example Input
Input 1:

 A = [1, 2, 2, 3, 1]
Input 2:

 A = [1, 2, 2]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

3 occurs once.
Explanation 2:

1 occurs once.

* */

package com.dsa.advance.bitManipulation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Observation and solution :

 1) Brute Force : use 2 loops, if element did not match then update element

 2) Hashmap : can create frequency map of Array, and check in map that if element having one frequency then it is unique
              element in the array

 3) Bit Manipulation : As per XOR property, if you do XOR of same number then, it will give output 0 and if you do XOR of 0 with
                       any number then, it will give same number

* */
public class SingleNumber {

    public int singleNumber(final List<Integer> A) {
        return 0;
    }

    // Method 1: Brute Force or Naive Approach
    // This method has TC:  is O(N2) & SC O(1), which is excluding given problem constraint 2*10^6
    public static int singleNumber_Bruteforce(final int[] A) {
        int n = A.length, element = 0;
        for (int i = 0; i < n; i++) {
            int count1 = 0; // to find out how many time value is appeared in the arry
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    // if(arr[i] == 1 ) { once boyleydi ikinci for gelince soldaki oldu
                    count1++; // arraydeki harfleri tek tek saymak icin
                }
            }
            if (count1 == 1) {
               // System.out.print(A[i] + " ");// 6 7 8 uniqe
                element = A[i];
            }
        }
        return element;
    }

    // Method 2 : HashMap Approach
    // Hashmap Approach :  This method will take O(N) time and O(N) space
    static int singleNumber_Hashmap(final int[] A) {
        int n = A.length, element = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();  // This will take O(N) space

        // Creating freq map
        for (int i = 0; i < n; i++) {
            freqMap.put(A[i], freqMap.getOrDefault(A[i], 0) + 1);
        }

        // Iterating Map
        for (Map.Entry<Integer, Integer> map : freqMap.entrySet()) {
            if (map.getValue() == 1) {
                element = map.getKey();
            }
        }
        return element;
    }

    // Method 3 :  Bit Manipulation Approach
    static int singleNumber_Bit(final int[] A) {
        int n = A.length;
        int element = 0;
        for (int i = 0; i < n; i++) {
            element = element ^ A[i];
        }
        return element;

    }


    // Method 4 :
    public static void uniqueNumber2(){
        int[] arr = {7,6,4,5,4,5,7,8};
        //step-1 xor all
        int xor = 0;
        for(int x:arr){
            xor = xor^x;
        }
        //step-2 find out the position of rightmost set bit
        int pos=0;
        int temp = xor;
        while((temp&1)!=1){
            temp = temp>>1;
            pos++;
        }

        //step-3 filter out no's from the array which have 1 at pos
        int setA = 0;
        for(int x:arr){
            if((x & (1<<pos)) > 0){
                setA = setA^x;
            }
        }

        // print the result
        System.out.println(setA);
        System.out.println(xor^setA);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 1};
        System.out.println(singleNumber_Bruteforce(a));
        System.out.println(singleNumber_Hashmap(a));
        System.out.println(singleNumber_Bit(a));
        // System.out.println(-1>>2);
        //uniqueNumber2();


        // Unique Number 3
        int[] b = {6, 5, 8, 7, 7, 8, 8, 5, 2, 5, 6, 6, 7};
        System.out.println(singleNumber_Bruteforce(b));
    }

}
