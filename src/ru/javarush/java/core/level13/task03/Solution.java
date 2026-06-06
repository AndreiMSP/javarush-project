package ru.javarush.java.core.level13.task03;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущую дату и сохраняем в переменной today
LocalDate today = LocalDate.now();

        // Вычисляем завтрашнюю дату на основе today
LocalDate tomorrow = today.plusDays(1);


        // Выводим завтрашнюю дату на экран
        System.out.println(tomorrow);
    }
}