package com.singleton;

public class ClientWithConcurrency implements Runnable {
    Student st;

    @Override
    public void run() {
        st = Student.getInstance();
    }

    public static void main(String[] args) {
        ClientWithConcurrency c1 = new ClientWithConcurrency();
        ClientWithConcurrency c2 = new ClientWithConcurrency();

        Thread t = new Thread(c1);
        Thread t1 = new Thread(c2);

        t1.start();
        t.start();
        System.out.println(c1.equals(c2));

    }
}
