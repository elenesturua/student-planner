package com.example.studentplanner.model;

import java.time.LocalDate;

public class Task {
    private String taskName;
    private int taskId;
    private int taskPriority;
    private String subject;
    private LocalDate dueDate;
    private boolean completed;

    public Task(String taskName, int taskId, int taskPriority, String subject, LocalDate dueDate) {
        this.taskName = taskName;
        this.taskId = taskId;
        this.taskPriority = taskPriority;
        this.subject = subject;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}


