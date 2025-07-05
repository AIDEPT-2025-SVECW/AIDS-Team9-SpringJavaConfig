package com.example.todo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.todo.service.TodoService;

@Configuration
public class AppConfig {

    @Bean
    public TodoService todoService() {
        return new TodoService();
    }
}
