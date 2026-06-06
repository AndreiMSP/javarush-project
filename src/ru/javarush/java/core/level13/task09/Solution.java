package ru.javarush.java.core.level13.task09;

import java.sql.Time;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущее время в каждой указанной зоне через ZonedDateTime.now(ZoneId.of(...))
        ZonedDateTime currentTimeInMinsk = ZonedDateTime.now(ZoneId.of("Europe/Paris", Map.of()));
        ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime currentTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        // Простой и наглядный формат даты и времени (локальное время конкретной зоны)


        // Выводим каждую зону на отдельной строке: название города + локальное время
        System.out.println("Минск: " + currentTimeInMinsk.getHour()+":"+currentTimeInMinsk.getMinute());
        System.out.println("Нью-Йорк: "+currentTimeInNewYork.getHour()+":"+currentTimeInNewYork.getMinute());
        System.out.println("Токио: "+currentTimeInTokyo.getHour()+":"+currentTimeInTokyo.getMinute());
    }
}