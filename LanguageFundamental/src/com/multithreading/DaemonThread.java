package com.multithreading;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println("Daemon Thread Example....");
    }

    // We can't create main thread as Daemon Thread because it executes very first, if we set then will get an exception
    public static void main(String[] args) {
        DaemonThread dm= new DaemonThread();
        dm.setDaemon(true);   // set Daemon thread before start it otherwise it will throw an exception.
        dm.start();
        // dm.setDaemon(false);  // Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
