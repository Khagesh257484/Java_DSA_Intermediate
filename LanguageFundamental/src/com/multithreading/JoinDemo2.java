package com.multithreading;

// Wants to wait child Thread
public class JoinDemo2 implements Runnable {
    static Thread mainThread;

    @Override
    public void run() {
        try {
            mainThread.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        mainThread=Thread.currentThread();
        JoinDemo2 jd = new JoinDemo2();
        Thread th= new Thread(jd);
        th.start();

        for (int i = 6; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            Thread.sleep(1000);
        }
    }
}
