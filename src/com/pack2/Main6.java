package com.pack2;

public class Main6 {

    public static void main(String[] args) throws InterruptedException {

        MyTask obj = new MyTask();

        Thread t1 = new Thread(() -> {
            try {
                obj.task();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-1");

        t1.start();

        t1.join();
    }
}