package com.pack3;

import java.util.Scanner;

class Pet {

    protected String petName;
    protected String ownerName;
    protected int age;

    Pet(String petName, String ownerName, int age) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.age = age;
    }

    protected void printPetDetails() {
        System.out.println("Pet Name: " + petName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Age: " + age + " years");
    }
}

class Dog extends Pet {

    Dog(String petName, String ownerName, int age) {
        super(petName, ownerName, age);
    }

    protected void printDogDetails() {
        printPetDetails();
        System.out.println("Type: Dog");
    }
}

public class GroomingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String petName = sc.nextLine();
        String ownerName = sc.nextLine();
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Error: Age must be greater than or equal to 0");
        } else {
            Dog dog = new Dog(petName, ownerName, age);
            dog.printDogDetails();
        }

        sc.close();
    }
}