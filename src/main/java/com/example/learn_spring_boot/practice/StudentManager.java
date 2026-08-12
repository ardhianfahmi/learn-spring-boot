package com.example.learn_spring_boot.practice;

import java.util.*;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    // CREATE
    public void addStudent(Student student){
        students.add(student);
    }

    // LIST
    public List<Student> getAllStudents() {
        return students;
    }

    

// DELETE
public boolean deleteStudent(String name) {
        return students.removeIf(s -> s.getName().equals(name));
    }

    
  public void updateGpa(String name, double newGpa) {
    Student student = students.stream()
            .filter(s -> s.getName().equals(name))
            .findFirst()
            .orElseThrow(() -> new StudentNotFoundException(name));
    student.setGpa(newGpa);
}

    // SECTION: FILTER pake Stream
public List<Student> getStudentsAboveGpa(double minGpa) {
    return students.stream()
            .filter(s -> s.getGpa() >= minGpa)  // lambda expression
            .toList();
}

// SECTION: SORT pake Stream
public List<Student> getSortedByGpaDesc() {
    return students.stream()
            .sorted((a, b) -> Double.compare(b.getGpa(), a.getGpa()))
            .toList();
}

// SECTION: MAP (transform data)
public List<String> getAllNames() {
    return students.stream()
            .map(Student::getName)  // method reference, versi ringkas lambda
            .toList();
}

    
}