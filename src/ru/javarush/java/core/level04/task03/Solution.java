package ru.javarush.java.core.level04.task03;

public class Solution {
    public static void main(String[] args) {
        // Инициализируем переменную для номера кресла
        int numChair = 2;

        // Используем цикл while для перебора номеров кресел
        while (numChair <= 10) {
            // Выводим текущий номер кресла на новой строке

            System.out.println(numChair);
            // Увеличиваем номер кресла на 2
            numChair += 2;
        }
    }
}