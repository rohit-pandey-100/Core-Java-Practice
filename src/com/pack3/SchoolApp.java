package com.pack3;


import java.util.Scanner;

class Course {

    String courseName;
    String instructorName;
    int durationHours;

    Course(String courseName, String instructorName, int durationHours) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.durationHours = durationHours;
    }

    void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Duration: " + durationHours + " hours");
    }
}

public class SchoolApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String courseName = sc.nextLine();
        String instructorName = sc.nextLine();
        int durationHours = sc.nextInt();

        if (durationHours <= 0) {
            System.out.println("Error: Duration must be greater than 0");
        } else {
            Course course = new Course(
                courseName,
                instructorName,
                durationHours
            );

            course.printCourseDetails();
        }

        sc.close();
    }
}