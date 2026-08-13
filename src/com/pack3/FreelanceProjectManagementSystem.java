package com.pack3;

import java.util.Scanner;

class Project {

    String projectID;
    String freelancerName;
    int hoursWorked;
    double hourlyRate;

    Project(String projectID, String freelancerName, int hoursWorked, double hourlyRate) {
        this.projectID = projectID;
        this.freelancerName = freelancerName;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateTotalCost() {
        return hoursWorked * hourlyRate;
    }

    void printProjectDetails() {
        System.out.println("Project ID: " + projectID);
        System.out.println("Freelancer: " + freelancerName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String projectID = sc.nextLine();
        String freelancerName = sc.nextLine();
        int hoursWorked = sc.nextInt();
        double hourlyRate = sc.nextDouble();

        if (hoursWorked <= 0) {
            System.out.println("Error: Hours worked must be greater than 0");
        } 
        else if (hourlyRate <= 0) {
            System.out.println("Error: Hourly rate must be greater than 0");
        } 
        else {
            Project project = new Project(
                projectID,
                freelancerName,
                hoursWorked,
                hourlyRate
            );

            project.printProjectDetails();
        }

        sc.close();
    }
}