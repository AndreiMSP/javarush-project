package ru.javarush.java.core.level13.task05;

import java.time.LocalDate;
import java.time.LocalTime;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущее время с помощью LocalTime.now()
        LocalTime currentTime = LocalTime.now();

        // Извлекаем часы, минуты и секунды из текущего времени
        int displayHours = currentTime.getHour();
        int displayMinutes = currentTime.getMinute();
        int displaySeconds = currentTime.getSecond();
        // Выводим часы, минуты и секунды в заданном формате
        System.out.println("Часы: " + displayHours +", минуты: "+displayMinutes+", секунды: "+displaySeconds);
    }
}