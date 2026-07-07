package com.pack3;

import java.util.*;

public class Code3 {

    public static int calculateTotal(int amount) {

        if (amount <= 0) {
            return -1;
        }

        int gst = (amount * 18) / 100;
        int total = amount + gst;

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        int result = calculateTotal(amount);

        System.out.println(result);

        sc.close();
    }
}