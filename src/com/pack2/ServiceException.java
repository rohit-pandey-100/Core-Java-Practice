package com.pack2;

public class ServiceException extends Exception {

    ServiceException(String msg) {
        super(msg);
    }

    static void test() throws ServiceException {
        System.out.println("Service Started");
    }

    public static void main(String[] args) throws ServiceException {
        test(); // ✅ Calling the method here
    }
}