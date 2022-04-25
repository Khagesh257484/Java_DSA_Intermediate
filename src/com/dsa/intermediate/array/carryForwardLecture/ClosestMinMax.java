package com.dsa.intermediate.array.carryForwardLecture;

/*
Ques :  Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array and at least one occurrence of the minimum value of the array.

Problem Constraints
1 <= |A| <= 2000

Input Format :
First and only argument is vector A

Output Format:
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array

Example :
 Input : A=[1,3];
 Output : 2
* */
public class ClosestMinMax {

    public int closestMinMax(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;  // declare to find Max and Min of Array
        int lat_min = 0, lat_max = 0, ans = Integer.MAX_VALUE;

        // Finding Min ad MAx
        for (int i = 0; i < n; i++) {
            if (A[i] > max)
                max = A[i];
            if (A[i] < min)
                min = A[i];
        }
        //System.out.println("Max ::" + max + " , Min ::" + min);

        for (int i = 0; i < n; i++) {
            if (A[i] == min)
                lat_min = i;

            if (A[i] == max)
                lat_max = i;

            if(lat_max!=0 && lat_min!=0){
                ans=Math.min(ans, Math.abs(lat_min-lat_max)+1);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        int a[] = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        System.out.println(closestMinMax.closestMinMax(a));


    }

}
