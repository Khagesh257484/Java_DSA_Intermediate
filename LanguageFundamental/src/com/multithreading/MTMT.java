package com.multithreading;

// Multiple Task Multiple Thread
public class MTMT {
    public static void main(String[] args) {
        MyThread1 mt1= new MyThread1();
        mt1.start();

        MyThread2 mt2= new MyThread2();
        mt2.start();

    }
}
