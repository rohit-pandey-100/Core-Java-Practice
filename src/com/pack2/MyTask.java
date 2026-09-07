package com.pack2;

public class MyTask {

    public synchronized void task() throws InterruptedException {

        System.out.println(
            Thread.currentThread().getName() + " starts"
        );

        wait(2000);

        System.out.println(
            Thread.currentThread().getName() + " ends"
        );
    }
}