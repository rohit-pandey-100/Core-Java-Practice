package com.pack2;

public class Main5 {

    public static void main(String[] args) {

        MyTask obj = new MyTask();

        Thread t1 = new Thread(() -> {
            try {
                obj.task();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                obj.task();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}