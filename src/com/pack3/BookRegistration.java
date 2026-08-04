package com.pack3;

import java.util.Scanner;

class Book
{
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book()
    {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with Title and Author
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with Title, Author and Price
    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;

        if (price >= 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 0.0;
        }
    }

    // Display Method
    public String displayDetails()
    {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}

public class BookRegistration
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        sc.nextLine();

        Book b = null;

        switch (choice)
        {
            case 1:
                b = new Book();
                break;

            case 2:
                String title = sc.nextLine();
                String author = sc.nextLine();
                b = new Book(title, author);
                break;

            case 3:
                title = sc.nextLine();
                author = sc.nextLine();
                double price = sc.nextDouble();
                b = new Book(title, author, price);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println("Book Details:");
        System.out.println(b.displayDetails());

        sc.close();
    }
}