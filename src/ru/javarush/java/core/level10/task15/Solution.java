package ru.javarush.java.core.level10.task15;

// Перечисление дней недели: каждое значение — отдельный день.


public class Solution {
    public static void main(String[] args) {
        // Используем цикл for-each для перебора всех значений перечисления DayOfWeek

        for (DayOfWeek test : DayOfWeek.values()) {
            System.out.println(test);
        }
        DayOfWeek day = DayOfWeek.valueOf("SUNDAY");
        System.out.println(day);

    }
}