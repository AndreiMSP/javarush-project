package ru.javarush.java.core.level13.task16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка с меткой времени заказа
        String orderTimestampString = "01.06.2025 14:30";

        // Создаем форматтер с шаблоном "dd.MM.yyyy HH:mm"
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // Парсим строку в объект LocalDateTime
        LocalDateTime parsedOrderDateTime = LocalDateTime.parse(orderTimestampString, dateTimeFormatter);

        // Выводим результат в стандартном ISO-формате (например, 2025-06-01T14:30)
        System.out.println(parsedOrderDateTime);
    }
}