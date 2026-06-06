package ru.javarush.java.core.level13.task11;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // Локальная дата-время телепорта (без привязки к часовому поясу)
        LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025, 6, 1, 18, 00);

        // Часовой пояс Минска

        ZonedDateTime teleportTimeMinskZoned = teleportScheduledLocal.atZone(ZoneId.of("Europe/Minsk"));
        ZoneId.of("Europe/Minsk");
        // Привязываем локальное время к Минску — получаем конкретное мгновение
        ZonedDateTime teleportTimeNewYorkZoned = teleportTimeMinskZoned.withZoneSameInstant(ZoneId.of("America/New_York"));

        // Переводим то же самое мгновение в часовой пояс Нью-Йорка


        // Выводим оба значения, чтобы увидеть разницу представлений одного мгновения
        System.out.println(teleportTimeMinskZoned);
        System.out.println(teleportTimeNewYorkZoned);
    }
}