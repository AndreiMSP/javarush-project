package ru.javarush.java.core.level14.task16;

public class Student {
    String studentName;
    String studentGroup;
    int studentScore;

    public Student(String studentName, String studentGroup, int studentScore) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentScore = studentScore;
    }

    public Student(String studentName, String studentGroup) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        studentScore = 0;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        studentGroup = "Unknown";
        studentScore = 0;
    }

    public Student() {
        studentName = "Unknown";
        studentGroup = "Unknown";
        studentScore = 0;
    }

    public void printAll() {
        System.out.println(studentName + " " + studentGroup + " " + studentScore);
    }
}
