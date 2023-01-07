package com.multithreading;

public class InterruptedDemo implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().isInterrupted());  // Initially thread was interrupted that means true
            //  System.out.println(Thread.interrupted());    // it will change the status of thread that means now it is not interrupted, it will false
            //System.out.println(Thread.currentThread().isInterrupted());
            // If thread is not interrupted then it will run with try block.
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);

            }
        }
        // if interrupted then it will first go in try block whenever it will come on sleep() method it will not go again in for loop, will exist from the for loop and will come in catch part.
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Called any service or task when thread in interrupted state");
            //run();
        }
    }

    public static void main(String[] args) {
        InterruptedDemo id = new InterruptedDemo();
        Thread th = new Thread(id);
        th.start();  // it will run with try block
        th.interrupt();  // now it will go with catch block
    }
}
