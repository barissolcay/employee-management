package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaskServiceTests {

    @Test
    public void testSaveTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("Human Resources", "Responsible for employee management.");
        Task savedTask = taskService.saveTask(task);
        assertNotNull(savedTask);
        assertEquals("Human Resources", savedTask.getName());
    }

    @Test
    public void testGetAllTasks() {
        TaskService taskService = new TaskService();
        Task task1 = new Task("Human Resources", "Responsible for employee management.");
        Task task2 = new Task("IT Department", "Manages the company's technology infrastructure.");
        taskService.saveTask(task1);
        taskService.saveTask(task2);
        assertEquals(2, taskService.getAllTasks().size());
    }
}
