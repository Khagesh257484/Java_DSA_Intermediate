package com.ggl.practice.basic;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number =sc.nextInt();
        int i;
        for(i=2;i<number;i++){
            if(number%i==0){
                break;
            }
        }
        if(i==number){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
