package com.multithreading;

public class SleepMethod implements Runnable  {
    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args)  {
        SleepMethod sp = new SleepMethod();
        Thread t= new Thread(sp);
        t.start();


    }


}
