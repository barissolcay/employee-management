package com.example.employeemanagement.model;

public class Task {
    private Long id;
    private String name;
    private String description;

    public Task() {
        // Boş kurucu
    }

    public Task(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter ve Setter metodları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
