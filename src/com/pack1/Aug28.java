package com.pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Aug28 {

    Scanner sc = new Scanner(System.in);

    void meth1() {
        System.out.println("Performing Exception Handling\n");

        String arr[] = new String[5];

        arr[1] = "Rohit";
        arr[2] = "Kumar";
        arr[3] = "Pandey";

        System.out.println(10);

        try {
            System.out.println("Try block executed");

            System.out.println("Enter the Number");

            System.out.println("==> " + 20 / Integer.parseInt(sc.nextLine()));

            System.out.println(arr[0].toUpperCase());

            System.out.println("Java is awesome");
        }

        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Catch block executed");
            e.printStackTrace();
        }

        finally {
            System.out.println("Finally block executed");
        }

        System.out.println(30);
    }

    void FilleOperations() 
    {

        System.out.println("Using the try-with-resources");

        try (FileInputStream fis =
                new FileInputStream("D:\\Exception.txt")) {

            System.out.println("Connection Created");

        }

        catch (IOException e) {

            System.out.println("File error!");
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {

        Aug28 obj = new Aug28();

        obj.meth1();

        obj.FilleOperations();
    }
}
