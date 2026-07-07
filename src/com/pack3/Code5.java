package com.pack3;

import java.util.*;

public class Code5 {

    public static double calculateAverageRating(int totalRating, int totalUsers) {

        if (totalRating < 0 || totalUsers <= 0) {
            return -1;
        }

        double averageRating = (double) totalRating / totalUsers;

        return averageRating;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalRating = sc.nextInt();
        int totalUsers = sc.nextInt();

        double result = calculateAverageRating(totalRating, totalUsers);

        if (result == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.printf("%.2f", result);
        }

        sc.close();
    }
}