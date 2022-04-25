package com.ggl.practice.basic;

import java.util.Scanner;

public class PrintPrimeNumbersLessThanNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        // Brute Force Approach
       /* if(number<=1){
            System.out.println("There are no prime numbers less than equal to  "+number);
        }else if(number>=2 ){
            System.out.print(2+" ");
        }

        int j=3;
        while(j<=number){
            int count=0;
            for(int i=2;i<j;i++){
                if(j %i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(j+" ");
            }
            j++;

        }*/  // Brute force Over
    }
}
