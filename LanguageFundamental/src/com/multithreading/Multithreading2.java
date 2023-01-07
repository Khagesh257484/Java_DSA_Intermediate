package com.multithreading;

// Creating Thread using the Runnable Interface
public class Multithreading2  implements  Runnable{
    void playAudio(){
        System.out.println("Audio is playing, it is different method can be perform with help of thread");
    }
    @Override
    public void run() {
        playAudio();
    }

    public static void main(String[] args) {
        Multithreading2 mt= new Multithreading2();
        Thread t= new Thread(mt);
        t.start();

        Thread t1= new Thread(mt);
        t1.start();
        //t1.start();   // Exception in thread "main" java.lang.IllegalThreadStateException

        // here we are calling playAudio() method from Object of Class, it's not a Thread calling.
        Multithreading2 mt1= new Multithreading2();
        mt1.playAudio();
    }
}
