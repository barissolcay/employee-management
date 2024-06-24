package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public Task saveTask(Task task) {
        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void clearTasks() {
        tasks.clear();
    }
}
