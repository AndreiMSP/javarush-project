package ru.javarush.java.core.level03.task17;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные для времени спортсменов
        int alexsTime = 1000;
        int mikesTime = 600;

        // Используем тернарный оператор для определения минимального времени
        int fastestTime = alexsTime < mikesTime ? alexsTime : mikesTime;

        // Выводим на экран наименьшее время
        System.out.println(fastestTime);
    }
}