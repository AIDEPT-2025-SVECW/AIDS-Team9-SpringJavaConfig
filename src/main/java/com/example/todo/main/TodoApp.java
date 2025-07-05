package com.example.todo.main;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.todo.config.AppConfig;
import com.example.todo.service.TodoService;

public class TodoApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TodoService service = context.getBean(TodoService.class);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    service.addTask(task);
                    break;
                case 2:
                    service.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int index = scanner.nextInt();
                    service.deleteTask(index);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
