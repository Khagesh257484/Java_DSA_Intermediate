package com.multithreading;

// Single Task Multiple Thread
public class STMT extends Thread{
    @Override
    public  void run(){
        System.out.println("Thread task need to be done or single task using multiple thread");
    }

    public static void main(String[] args) {   // main thread created by JVM
        STMT st= new STMT();  // Thread 1
        st.start();

        STMT st1= new STMT();  // Thread 2
        st1.start();

        // So total 3 threads are making here

    }
}
