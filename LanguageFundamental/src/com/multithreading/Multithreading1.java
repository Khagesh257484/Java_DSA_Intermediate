package com.multithreading;

// Creating Thread using Thread class

import java.time.LocalDateTime;
import java.util.Calendar;

public class Multithreading1 extends Thread {

    public void playVideo(){
        System.out.println("Video is playing , "+"StartTime "+ Calendar.getInstance());
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println(startTime);
        System.out.println("Hi VLC Video");
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println(endTime);
        //Thread.sleep();
    }
    public void run() {
        System.out.println("Thread task is printing number from 1 to 5, Below is number");
        for (int i = 1; i <= 5; i++) {
            if (i == 5)
                System.out.println(i);
            else
                //Thread.sleep(10);  // Why Error
                System.out.print(i + ", ");

        }

        playVideo();
    }

    public static void main(String[] args) {
        Multithreading1 t = new Multithreading1();   // This is Thread Object because we are extending Thread class here so it will work like as thread class

        t.start();    //Thread 1:  You can see here there is no start() method is present but able to call from thread class, this method internally call run() method.

        t.start();  //Thread1: Exception in thread "main" java.lang.IllegalThreadStateException

        /*
         We're getting exception here because as per thread life cycle if thread is dead then can't awake or start it again & in this program, we have only one thread.
        * */

    }
}
