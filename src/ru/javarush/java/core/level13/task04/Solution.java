package ru.javarush.java.core.level13.task04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // LocalDateTime хранит одновременно дату и время
        // Фиксируем точный момент: 20 марта 2022 года, 10:00
        LocalDateTime historicMoment = LocalDateTime.of(2022,3,20,10,00);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM");
        String form = historicMoment.format(formatter);
        // Выводим зафиксированный момент на экран
        System.out.println(historicMoment);
    }
}