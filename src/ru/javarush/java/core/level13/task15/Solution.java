package ru.javarush.java.core.level13.task15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate с датой 15 марта 2023 года
        LocalDate specificEventDate = LocalDate.of(2023, 3, 15);

        // Готовим форматтер с шаблоном "dd.MM.yyyy" (например, "15.03.2023")
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Форматируем дату в строку с учетом заданного шаблона
        String friendlyDisplayDateString = specificEventDate.format(dateTimeFormatter);

        // Выводим получившуюся строку на экран
        System.out.println(specificEventDate);
        System.out.println(friendlyDisplayDateString);
    }
}