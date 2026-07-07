package com.pack3;

import java.util.*;

public class Code4 {

    public static int getDiscountedPrice(int price) {

        if (price <= 0) {
            return -1;
        }

        int discount = (price * 10) / 100;
        int finalPrice = price - discount;

        return finalPrice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();

        int result = getDiscountedPrice(price);

        System.out.println(result);

        sc.close();
    }
}
