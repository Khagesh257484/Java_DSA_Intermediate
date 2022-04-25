package com.ggl.practice.basic;

import java.util.Scanner;

public class SquareRootOrPerfectSquare {
    public static void main(String[] args) {
        /*
         1)Brute Force Approach
            if (n%i==0 && n/i=i) : here i is loop starting value

         2) using Math.sqrt function : it is optimized one

         3) Without using any function optimized the solution

        * */

        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        /*int count=0;

        for(int i=1;i*i<=A;i++){
            if((A % i == 0) && (A/i== i)){
                count=i;
            }
        }
        if(count>=1){
            System.out.println(count);
        }else {
            System.out.println("Not Perfect Square");
        }*/

        // 2nd way to solve it
        int number=(int)Math.sqrt(A);
        if(number*number==A){
            System.out.println("Perfect Square : "+number);
        }else{
            System.out.println("NOT Perfect Square");
        }
       // System.out.println(number);
    }
}
