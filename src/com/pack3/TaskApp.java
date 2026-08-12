package com.pack3;

import java.util.Scanner;

class Task {

    String taskID;
    String assignedTo;
    int estimatedHours;
    int actualHours;
    boolean isCompleted;

    Task(String taskID, String assignedTo, int estimatedHours,
         int actualHours, boolean isCompleted) {

        this.taskID = taskID;
        this.assignedTo = assignedTo;
        this.estimatedHours = estimatedHours;
        this.actualHours = actualHours;
        this.isCompleted = isCompleted;
    }

    void markCompleted() {
        isCompleted = true;
    }

    void addExtraHours(int extraHours) {
        actualHours = actualHours + extraHours;
    }

    int calculateTotalHours() {
        return actualHours;
    }

    void printTaskDetails() {
        System.out.println("Task ID: " + taskID);
        System.out.println("Assigned To: " + assignedTo);
        System.out.println("Estimated Hours: " + estimatedHours);
        System.out.println("Actual Hours: " + actualHours);
        System.out.println("Completed: " + (isCompleted ? "Yes" : "No"));
    }
}

class TeamLeaderTask extends Task {

    TeamLeaderTask(String taskID, String assignedTo, int estimatedHours,
                   int actualHours, boolean isCompleted) {

        super(taskID, assignedTo, estimatedHours, actualHours, isCompleted);
    }

    void assignExtraHours(int hours) {
        addExtraHours(hours);
    }

    void completeTask() {
        markCompleted();
    }

    void printLeaderTaskDetails() {
        printTaskDetails();
        System.out.println("Role: Team Leader");
    }
}

public class TaskApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String taskID = sc.nextLine();
        String assignedTo = sc.nextLine();
        int estimatedHours = sc.nextInt();
        int actualHours = sc.nextInt();
        boolean isCompleted = sc.nextBoolean();
        int extraHours = sc.nextInt();

        if (extraHours < 0) {

            System.out.println(
                "Error: Extra hours must be greater than or equal to 0"
            );

        } else {

            TeamLeaderTask task = new TeamLeaderTask(
                taskID,
                assignedTo,
                estimatedHours,
                actualHours,
                isCompleted
            );

            task.assignExtraHours(extraHours);
            task.completeTask();

            task.printLeaderTaskDetails();
        }

        sc.close();
    }
}