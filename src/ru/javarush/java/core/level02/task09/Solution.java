package ru.javarush.java.core.level02.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int и присваиваем ей произвольное целое значение (код доступа)
        int code = 111222;


        // Преобразуем целочисленное значение accessCode в строку
        String accessCode = String.valueOf((code));

        // Выводим полученную строку на экран
        System.out.println(accessCode);
    }
}