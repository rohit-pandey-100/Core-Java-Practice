package com.pack2;

import java.util.Scanner;

class Book
{
    private String title;
    private String author;
    private int copiesSold;

    // Default Constructor
    public Book()
    {

    }

    // Setter Methods
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setCopiesSold(int copiesSold)
    {
        this.copiesSold = copiesSold;
    }

    // Getter Methods
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getCopiesSold()
    {
        return copiesSold;
    }

    // toString Method
    @Override
    public String toString()
    {
        return "Title: " + title + " Author: " + author + " CopiesSold: " + copiesSold;
    }
}

public class Library
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt())
        {
            System.out.println("Invalid number of books.");
            //return;
        }

        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid number of books.");
            //return;
        }

        int threshold = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            Book b = new Book();

            b.setTitle(sc.nextLine());
            b.setAuthor(sc.nextLine());
            b.setCopiesSold(sc.nextInt());
            sc.nextLine();

            if(b.getCopiesSold() > threshold)
            {
                System.out.println(b);
            }
        }

        sc.close();
    }
}