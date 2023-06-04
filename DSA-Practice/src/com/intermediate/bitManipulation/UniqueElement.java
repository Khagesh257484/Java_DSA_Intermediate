/*
Question : For a given an array, find the 1(one) unique element in the array.
   {2,6,7,3,6,2,3}
* */

package com.intermediate.bitManipulation;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static int uniqueElement_bruteForce(int[] arr) {
        int n = arr.length, uniqueElement = 0;
        for (int i = 0; i < n; i++) {
            int frequency = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    frequency++;
            }
            if (frequency == 1)
                uniqueElement = arr[i];
        }
        return uniqueElement;
    }

    public static int uniqueElement_Bit(int[] arr) {
        int n = arr.length, uniqueElement = 0;
        for (int i = 0; i < n; i++) {
            uniqueElement = uniqueElement ^ arr[i];
        }
        return uniqueElement;
    }

    public static int uniqueElement_map(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // create frequency map
        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.get(arr[i]) == 1)
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            else
                frequencyMap.put(arr[i], 1);
        }
        System.out.println(frequencyMap);
        // Read Frequency Map

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 3, 6, 2, 3};
        System.out.println(uniqueElement_bruteForce(arr));
        System.out.println(uniqueElement_Bit(arr));
        uniqueElement_map(arr);
    }
}

