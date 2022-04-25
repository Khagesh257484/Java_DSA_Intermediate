package com.company.java.dsa.string;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int operation=sc.nextInt();
            for(int i=0;i<operation;i++){
                String s=sc.next();  // sc.nextLine() : That means your input will start after taking one value by default
                System.out.println(s.length());
            }

    }
}
