package com.multithreading;

public class MyThread1 extends Thread{
    public void run(){
        System.out.println("First thread task");
    }

    public static void main(String[] args) {
        Thread t= new Thread();
        MyThread1 mt= new MyThread1();

        mt.run();
    }
}
