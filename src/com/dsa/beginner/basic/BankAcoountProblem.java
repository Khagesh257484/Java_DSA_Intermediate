package com.company.java.dsa.basic;

import java.util.Scanner;

public class BankAcoountProblem {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        long bank_balance=sc.nextLong();  // bank_balance

        int operation=sc.nextInt();   // No of operations

        for(int i=1;i<=operation;i++){
            int type=sc.nextInt();

            if(type==1){
                long add_amount=sc.nextLong();
                bank_balance+=add_amount;
                System.out.println(bank_balance);

            }else if(type==2){
                long sub_amount=sc.nextLong();
                if(sub_amount < bank_balance){
                    bank_balance-=sub_amount;
                    System.out.println(bank_balance);
                }else if(sub_amount > bank_balance){
                    System.out.println("Insufficient Funds");
                }
            }
        }

    }
}
