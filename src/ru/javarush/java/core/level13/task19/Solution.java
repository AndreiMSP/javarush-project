package ru.javarush.java.core.level13.task19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {
        // Текущая дата (берется из системных настроек)
        LocalDate today = LocalDate.now();

        // Дата дедлайна проекта: 15 мая 2025 года
        LocalDate projectDeadline = LocalDate.of(2025, 5, 15);

        // Количество дней между today и projectDeadline
        long daysRemaining = ChronoUnit.DAYS.between(today, projectDeadline);

        // Выводим результат на экран
        System.out.println(daysRemaining);
    }
}