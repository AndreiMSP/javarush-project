package ru.javarush.java.core.level03.task12;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную roomTemperature типа int
        int roomTemperature = 19;
        boolean isComfortable;

        // Проверяем, находится ли roomTemperature в диапазоне от 20 до 25 включительно
        if (roomTemperature <= 25 && roomTemperature >= 20) {
            isComfortable = true;
        } else {
            isComfortable = false;
        }

        // Выводим значение переменной isComfortable на экран
        System.out.println(isComfortable);
    }
}