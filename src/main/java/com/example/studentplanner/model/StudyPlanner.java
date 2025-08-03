package com.example.studentplanner.model;

import java.util.List;
public class StudyPlanner {
    private List<Task> tasks;

    public StudyPlanner(List<Task> tasks) {
        this.tasks = tasks;
    }


    public void addTask(Task task) {
        tasks.add(task);
        System.out.println(task + " added to your planner!");
    }

    public void removeTask(int index) {
        if(index>=0 && index < tasks.size()){
            tasks.remove(index);
            System.out.println(tasks + " removed from your planner!");
        } else {
            System.out.println("Task not found!");
        }
    }

    public void markCompleted(int index) {
        if (index>=0 && index<tasks.size()){
            tasks.get(index).setCompleted(true);
            System.out.println(tasks + " marked completed!");
        } else {
            System.out.println("Task not found!");
        }
    }

    public void viewTasks() {
        if(tasks==null){
            System.out.println("No tasks found!");
        } else {
            for (int i=0; i<tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println(i + ". " + task.getTaskName() + " | Due: " + task.getDueDate()
                        + " | Subject: " + task.getSubject()
                        + " | Priority: " + task.getTaskPriority()
                        + " | Completed: " + task.isCompleted());
            }
        }
    }

}
