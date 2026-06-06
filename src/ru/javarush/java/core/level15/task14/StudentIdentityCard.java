package ru.javarush.java.core.level15.task14;

public class StudentIdentityCard {
    private final String studentName;


    public StudentIdentityCard() {
        this.studentName = "test";
    }

    public StudentIdentityCard(String initialName) {
        this.studentName = initialName;
    }

    public String getStudentName() {
        return studentName;
    }
}
