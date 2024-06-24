package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Task;
import com.example.employeemanagement.service.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskControllerTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        taskService.clearTasks();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("IT Department", "Manages the company's technology infrastructure.");
        ResponseEntity<Task> response = restTemplate.postForEntity("/api/tasks/add", task, Task.class);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
    }

    @Test
    public void testGetAllTasks() {
        Task task1 = new Task("Human Resources", "Responsible for employee management.");
        Task task2 = new Task("IT Department", "Manages the company's technology infrastructure.");
        restTemplate.postForEntity("/api/tasks/add", task1, Task.class);
        restTemplate.postForEntity("/api/tasks/add", task2, Task.class);

        ResponseEntity<Task[]> response = restTemplate.getForEntity("/api/tasks/list", Task[].class);
        Task[] tasks = response.getBody();

        assertNotNull(tasks);
        assertEquals(2, tasks.length);
    }
}
