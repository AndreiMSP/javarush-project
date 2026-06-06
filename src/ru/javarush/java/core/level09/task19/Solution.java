package ru.javarush.java.core.level09.task19;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной строкой
        StringBuilder code = new StringBuilder("abcdef");

        // Разворачиваем строку с помощью стандартного метода reverse()
        code.reverse();

        // Выводим результат на экран: должно получиться "fedcba"
        System.out.println(code);
    }
}