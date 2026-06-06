package ru.javarush.java.core.level13.task06;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate для 15 декабря 1990 года
        LocalDate userBirthDate = LocalDate.of(1990, 12, 15);


        // Получаем день недели для указанной даты
        DayOfWeek dayOfWeek = userBirthDate.getDayOfWeek();

        // Выводим день недели на экран
        System.out.println(dayOfWeek);
    }
}