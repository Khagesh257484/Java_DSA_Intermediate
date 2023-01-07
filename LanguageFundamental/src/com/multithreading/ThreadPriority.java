package com.multithreading;

public class ThreadPriority  extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());  // will print 5 if you don't set
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());  // priority will be 5 of main thread

        ThreadPriority t= new ThreadPriority();
        t.start();  // this thread has priority 5 by default

        ThreadPriority t1= new ThreadPriority();
        t1.setPriority(9);
        t1.start();   // priority will be 9

        ThreadPriority t3= new ThreadPriority();
        t3.setPriority(MAX_PRIORITY);  // we can use constant as well
        t3.start();

        ThreadPriority t2= new ThreadPriority();
        t2.setPriority(11);   // Exception in thread "main" java.lang.IllegalArgumentException
        // if we'll set priority less than 1 and more than 10 then will get RuntimeError.


    }
}
