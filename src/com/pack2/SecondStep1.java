package com.pack2;

public class SecondStep1 extends Exception {

    public static void main(String[] args) {

        try {
            throw new SecondStep1();
        }
        catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}