package ru.javarush.java.core.level13.task12;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1) Создаем ZonedDateTime для 1 июня 2025 года, 12:00 в зоне Europe/Minsk

        LocalDateTime time = LocalDateTime.of(2025, 6, 1, 12, 00);
        ZonedDateTime zone = time.atZone(ZoneId.of("Europe/Minsk"));
        ZonedDateTime originalEventTime = ZonedDateTime.of(2025, 6, 1, 12, 00, 00, 00, ZoneId.of("Europe/Minsk"));
        ZonedDateTime zone2 = ZonedDateTime.of(time, ZoneId.of("Europe/Minsk"));

        // 2) Преобразуем ZonedDateTime в абсолютное мгновение Instant (UTC, часовой пояс не влияет)
        Instant universalInstant = originalEventTime.toInstant();

        // 3) Тот же самый Instant отображаем как локальное время для зоны Asia/Tokyo
        ZonedDateTime eventTimeTokyoZoned = ZonedDateTime.ofInstant(universalInstant, ZoneId.of("Asia/Tokyo"));

        // 4) Выводим все три значения
        System.out.println(originalEventTime);
        System.out.println(universalInstant);
        System.out.println(eventTimeTokyoZoned);
    }
}