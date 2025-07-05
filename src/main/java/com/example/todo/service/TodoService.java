package com.example.todo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.todo.model.TodoItem;

public class TodoService {

    private final List<TodoItem> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(new TodoItem(task));
        System.out.println("✅ Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("📭 No tasks found.");
        } else {
            System.out.println("📝 To-Do List:");
            int i = 1;
            for (TodoItem item : tasks) {
                System.out.println(i++ + ". " + item.getTask());
            }
        }
    }

    public void deleteTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            TodoItem removed = tasks.remove(index - 1);
            System.out.println("❌ Task removed: " + removed.getTask());
        } else {
            System.out.println("⚠️ Invalid task number.");
        }
    }
}
