package com.example.todo.model;

public class TodoItem {
    private String task;

    public TodoItem(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return task;
    }
}
