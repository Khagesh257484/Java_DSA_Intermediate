package com.ggl.practice.numberConversion;

import java.util.Scanner;

public class BinaryToDecimal {

    /*
    *  Binary to decimal conversion Ex: 101 = 5
    *
    *  1) base of binary is 2 and power start from the 0 from right to left till end, power will increase by one for
    *     single shifting.
    *
    *  2) sum of (2^0*last_digit_of_number) all numbers will be your decimal number
    *
    *  3) If Binary number is Given in String format then convert it into long number
    *      long number=Long.parseLong(numberString);
    *
    *  4)Explanation  101 : 2^0*1+2^1*0+2^2*1
    * */
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
       /* long number=sc.nextInt();
        long base=2, power=0,sum=0;*/

        String numberString=sc.next();
        long number=Long.parseLong(numberString);
        long base=2,power=0,sum=0;

        while(number!=0){
            long last_digit=number%10;
            sum=sum+(long)Math.pow(base,power)*last_digit;
            number=number/10;
            power++;
        }

        System.out.println(sum);
    }
}
