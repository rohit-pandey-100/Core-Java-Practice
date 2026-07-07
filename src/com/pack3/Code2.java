package com.pack3;

import java.util.*;

public class Code2 {

    public static double calculateEngagementRate(int likes, int comments, int followers) {

        if (likes < 0 || comments < 0 || followers <= 0) {
            return -1;
        }

        double engagementRate = ((likes + comments) * 100.0) / followers;

        return engagementRate;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int likes = sc.nextInt();
        int comments = sc.nextInt();
        int followers = sc.nextInt();

        double result = calculateEngagementRate(likes, comments, followers);

        if (result == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.printf("%.2f%%", result);
        }

        sc.close();
    }
}