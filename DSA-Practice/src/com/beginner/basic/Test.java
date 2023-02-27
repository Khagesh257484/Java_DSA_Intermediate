package com.beginner.basic;

import java.util.Scanner;

public class Test {
    /* Steps for Division method:

    If we were given two numbers, then

    First, divide the large number by a small number.
    If the remainder is left, then divide the first divisor by remainder.
    If the remainder divides the first divisor completely, then it is the HCF or highest common factor of the given two numbers.
    If the remainder does not divide the first divisor completely, then repeat the steps.
    * */
    static int circleArea(int radius) {
        return (int) Math.ceil(Math.PI*(radius*radius));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number1= sc.nextInt();
        //int number2=sc.nextInt();
        System.out.println(circleArea(number1));

    }
}
