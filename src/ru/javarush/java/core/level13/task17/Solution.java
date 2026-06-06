package ru.javarush.java.core.level13.task17;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем сегодняшнюю дату
        LocalDate today = LocalDate.now();

        // Прибавляем к ней 10 дней, чтобы узнать дату начала обратного отсчета
        LocalDate holidayCountdownStart = today.plusDays(10);


        // Выводим результат на экран
        System.out.println(holidayCountdownStart);

    }
}