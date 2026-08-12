package com.example.learn_spring_boot.practice;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String name) {
        super("Student not found: " + name);
    }
}