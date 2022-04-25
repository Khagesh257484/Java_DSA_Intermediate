package com.dsa.intermediate.array.subarrays;

/*
Question : For given an array find the sum
* */
public class Test {

    public void printAllSubarrays(int[] a) {
        for (int s = 0; s < a.length; s++) {
            for (int e = s; e <a.length; e++) {
                System.out.print(a[e]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] a = {1, 2, 3, 4, 5};
        test.printAllSubarrays(a);
    }
}
