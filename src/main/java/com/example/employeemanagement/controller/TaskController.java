package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Task;
import com.example.employeemanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        Task newTask = taskService.saveTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }
}
