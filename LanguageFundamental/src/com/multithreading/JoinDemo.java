package com.multithreading;

public class JoinDemo implements Runnable{
    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo jd= new JoinDemo();
        Thread t= new Thread(jd);
        t.start();
        t.join(); // Check output once without using join, will get output from both thread together, if we use join method then main thread run once then it will wait for completion of child thread. After that main thread will run
        for(int i=6;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            Thread.sleep(1000);
          //  t.join();

        }

    }
}
