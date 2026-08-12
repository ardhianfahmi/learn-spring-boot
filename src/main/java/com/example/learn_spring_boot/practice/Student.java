package com.example.learn_spring_boot.practice;

public class Student implements Person {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

// GETTER
@Override
    public String getName(){
        return name;
    }
  
    public int getAge(){
        return age;
    }

    public double getGpa(){
        return gpa;
    }

    // SETTER
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }  

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student { name ='}" + name + "'" + ", age = " + age + ", gpa = " + gpa + " }";
    }

    @Override
    public String getSummary() {
        return "Student Summary: Name = " + name + ", GPA = " + gpa;
    }
}