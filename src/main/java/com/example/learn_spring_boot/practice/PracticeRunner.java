package com.example.learn_spring_boot.practice;

public class PracticeRunner {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Budi", 20, 3.5));
        manager.addStudent(new Student("Sinta", 21, 3.9));
        manager.addStudent(new Student("Andi", 22, 2.8));

        System.out.println("All: " + manager.getAllStudents());
        System.out.println("Above 3.0: " + manager.getStudentsAboveGpa(3.0));
        System.out.println("Sorted: " + manager.getSortedByGpaDesc());

        try {
            manager.updateGpa("NotExist", 4.0);
        } catch (StudentNotFoundException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}