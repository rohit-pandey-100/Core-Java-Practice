package com.pack3;

//import java.util.*;// This imports all classes inside the java.util package. Example: ArrayList, Scanner, HashMap, Random.
import java.util.Scanner; // also write like this

public class Code1 {

    public static int calculateSurgeFare(int baseFare, int surgePercent) {

        if (baseFare < 0 || surgePercent < 0) {
            return -1;
        }

        int surgeAmount = (baseFare * surgePercent) / 100;
        int finalFare = baseFare + surgeAmount;

        return finalFare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base Fare:");
        int baseFare = sc.nextInt();

        System.out.println("Enter Surge Percentage:");
        int surgePercent = sc.nextInt();

        int result = calculateSurgeFare(baseFare, surgePercent);

        System.out.println("Final Fare = " + result);

        sc.close();
    }
}