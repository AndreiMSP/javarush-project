package ru.javarush.java.core.level13.task02;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущую дату системы и сохраняем в переменную today
        LocalDate today = LocalDate.now();

        // Вычисляем дату, предшествующую today, и сохраняем в переменную yesterday
        LocalDate yesterday = today.minusDays(1);

        // Выводим вчерашнюю дату на экран
        System.out.println(yesterday);
    }
}