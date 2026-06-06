package ru.javarush.java.core.level11.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные по условию
        int stepsPerUnit = 0;
        int totalDistance = 100;
        try {
            int result = totalDistance / stepsPerUnit;
            // Пытаемся выполнить деление, которое вызовет ArithmeticException (деление на ноль)


            // Этот вывод здесь для наглядности (не будет выполнен при stepsPerUnit = 0)


        } catch (ArithmeticException e) {
            // Дружелюбное сообщение для оператора при делении на ноль
            System.out.println("Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры.");

        }
    }
}