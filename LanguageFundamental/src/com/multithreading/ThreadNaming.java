package com.multithreading;
/*
 In this class, we will learn how can we set and get thread name.
* */
public class ThreadNaming extends  Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
       // System.out.println(Thread.currentThread().getName());

        /*
         In run method you will get name Thread-0, Thread-1... so on. if you set the name then you will get
         that name whatever you set for thread.

         but inside the main method if you try to get the name of thread, then you'll get the main thread
         name.
        * */

        // Here also we can change the name of thread
    }

    public static void main(String[] args) {    // This is main Thread
        ThreadNaming t= new ThreadNaming();   // This is Thread-0
        t.start();
        System.out.println(Thread.currentThread().getName());  // Will get name of main thread

        ThreadNaming t1= new ThreadNaming();  // This is Thread-1
        t1.start();
        System.out.println("t1 thread is alive : "+t1.isAlive());  // true

        ThreadNaming t2= new ThreadNaming();
        t2.setName("Khagesh");
        t2.start();
        System.out.println("t1 thread is alive : "+t1.isAlive());  // false
    }
}
