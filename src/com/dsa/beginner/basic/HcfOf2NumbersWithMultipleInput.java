package com.ggl.practice.basic;

import java.util.Scanner;

public class HcfOf2NumbersWithMultipleInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int type=sc.nextInt();
        for(int i=1;i<=type;i++){
            int number1=sc.nextInt();
            int number2= sc.nextInt();
            int remainder=number1%number2;
            while (remainder!=0){
                number1=number2;
                number2=remainder;
                remainder=number1%number2;
            }
            System.out.println(number2);
        }
    }
}
