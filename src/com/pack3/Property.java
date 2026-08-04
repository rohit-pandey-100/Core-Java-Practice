package com.pack3;

public class Property
{
    // Instance variables
    String propertyName;
    String city;
    double price;
    double areaInSqFt;
    boolean availability;

    // No constructor is written.
    // JVM provides the default constructor automatically.

    // Method to initialize values
    public void initializeProperty(String name, String cityName, double cost,
                                   double area, boolean isAvailable)
    {
        // Property Name Validation
        if(name.length() >= 3)
        {
            propertyName = name;
        }
        else
        {
            System.out.println("Invalid Property Name");
        }

        // City Validation
        if(cityName.length() >= 3)
        {
            city = cityName;
        }
        else
        {
            System.out.println("Invalid City Name");
        }

        // Price Validation
        if(cost > 0)
        {
            price = cost;
        }
        else
        {
            System.out.println("Price must be greater than 0");
        }

        // Area Validation
        if(area > 0)
        {
            areaInSqFt = area;
        }
        else
        {
            System.out.println("Area must be greater than 0");
        }

        // Availability
        availability = isAvailable;
    }

    // Business Logic Method
    public double calculatePropertyTax(double taxPercentage)
    {
        return (price * taxPercentage) / 100;
    }

    // Business Logic Method
    public String checkAvailability()
    {
        if(availability)
        {
            return "Available";
        }
        else
        {
            return "Not Available";
        }
    }

    // Display Details
    public void displayPropertyDetails()
    {
        System.out.println("Property Name : " + propertyName);
        System.out.println("City          : " + city);
        System.out.println("Price         : " + price);
        System.out.println("Area          : " + areaInSqFt);
        System.out.println("Availability  : " + checkAvailability());
    }
}