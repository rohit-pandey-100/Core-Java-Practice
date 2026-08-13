package com.pack3;

import java.util.Scanner;

class Parcel {

    String parcelID;
    String senderName;
    String receiverName;
    double weightKg;
    double distanceKm;
    double ratePerKgKm;

    Parcel(String parcelID, String senderName, String receiverName,
           double weightKg, double distanceKm, double ratePerKgKm) {

        this.parcelID = parcelID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
        this.ratePerKgKm = ratePerKgKm;
    }

    double calculateDeliveryCost() {
        return weightKg * distanceKm * ratePerKgKm;
    }

    void printParcelDetails() {
        System.out.println("Parcel ID: " + parcelID);
        System.out.println("Sender: " + senderName);
        System.out.println("Receiver: " + receiverName);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Rate per kg/km: " + ratePerKgKm);
        System.out.println("Total Delivery Cost: " + calculateDeliveryCost());
    }
}

public class CourierApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String parcelID = sc.nextLine();
        String senderName = sc.nextLine();
        String receiverName = sc.nextLine();
        double weightKg = sc.nextDouble();
        double distanceKm = sc.nextDouble();
        double ratePerKgKm = sc.nextDouble();

        if (weightKg <= 0) {
            System.out.println("Error: Weight must be greater than 0");
        } else {
            Parcel parcel = new Parcel(
                parcelID,
                senderName,
                receiverName,
                weightKg,
                distanceKm,
                ratePerKgKm
            );

            parcel.printParcelDetails();
        }

        sc.close();
    }
}