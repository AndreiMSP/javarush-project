package ru.javarush.java.core.level14.task06;

public class Solution {
    public static void main(String[] args) {
        // "Зачисляем" нового студента, сразу задавая имя и оценку в конструкторе
        Student student = new Student("Иван-дурак", 5);

        // Торжественно объявляем о его появлении
        System.out.println("Имя: " + student.studentName + ", оценка: " + student.studentGrade);
    }
}

// Отдельный класс Student с полями и конструктором