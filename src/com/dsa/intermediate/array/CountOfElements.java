package com.dsa.intermediate.array;
/*
Question : Given an array of n elements, count number of elements having at least 1 number greater than itself.
ex: [-4,-6,-2,7,8,5,4,8,1,2]
explanation : -4 is greater than -6, so count will be one.
             -2 is greater than -6, so count will be two & 7 is greater than -2 so it will be 3.

Observation :
 1) All the max numbers are not counted cause no number is greater than the max number
 2) any number less than greater number will be counted.
     So Ans= N - Count_of_max , N is size of array here

Plan :
  1) First find the max number of array
  2) Count the max number in array
  3) return N- count_of_max

* */
public class CountOfElements {
    public static void main(String[] args) {

    }
}
