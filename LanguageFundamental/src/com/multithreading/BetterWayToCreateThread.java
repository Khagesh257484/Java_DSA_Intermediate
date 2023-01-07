package com.multithreading;
public class BetterWayToCreateThread extends VLC implements Runnable{
    public static void main(String[] args) {
        BetterWayToCreateThread  bt= new BetterWayToCreateThread();  // Create main class object
        Thread thread=new Thread(bt);  // Pass object in thread class
        thread.start();   // call start method of thread class
    }

    @Override
    public void run() {   // By default, it has default modifier so if we do not use public then we can not override
        VLC vlc= new BetterWayToCreateThread();  // Creating child class object from parent class reference
        vlc.playAudio('c');
        vlc.playVideo('v');

    }
}
