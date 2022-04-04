package com.dsa.intermediate.recursion;

public class PrintHelloWorld2 {
    // Question :  print Hello World 5 times without using any loop and use only one method

    // We can declare one variable and can increment this variable till 5

    //static int n = 1;  // If we declare static then it can't be change


    // first check this message methode before go to message1()
    public static void message() {
    /*    if (n <= 5) {
            System.out.println("Ohh... Condition satisfied, I am running...");
        }else{
            System.out.println("Boom...! Condition not satisfied...");
        }
        n= n+ 1;*/


        // Interesting fact : recursion basic
      /*  int count=1;
        while(count<=5){
            System.out.println("Hello World.....");
            count++;
            message();

        }*/



        // Now here actually start what is recursion :
        // Recursion : When fn call itself is called the recursion




    }

    public static void message1(int n){
        if(n>=5){
            System.out.println("Breaking recursion...");
            return;
        }
        System.out.println("Hello World..");

       // message1(1); : Stack Overflow error
        message1(n+1);
    }
    public static void main(String[] args) {

        // Can Print 5 times using loop
      /*  int n=5;
        while(n!=0){
            message();
            n--;
        }
*/

        // recursion
      //  message();   // When this error achieve : StackOverflow

        message1(0);

    }
}
