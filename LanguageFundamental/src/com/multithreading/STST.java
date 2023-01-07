package com.multithreading;

// Single Task Single Thread
public class STST extends Thread {

    @Override
    public void run(){
        System.out.println("Thread task need to be done or need to be coded");
    }

    public static void main(String[] args) {
        STST st= new STST();
        st.start();

    }
}
