package ru.javarush.java.core.level02.task12;

public class Solution {
    public static void main(String[] args) {
        // Очки приходят как текстовые строки с отрицательными числами
        String number1 = "-10";
        String number2 = "-25";

        // Преобразуем строки в числа типа int
        int transf1 = Integer.parseInt(number1);
        int transf2 = Integer.parseInt(number2);

        // Складываем результаты двух раундов
        int summ = transf1 + transf2;

        // Выводим общий счёт на экран
        System.out.println(summ);

    }
}