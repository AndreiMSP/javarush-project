package ru.javarush.java.core.level07.task15;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив с заданными значениями
        // Первая строка массива
        // Вторая строка массива
        // Третья строка массива
        int[][] miniGameScores = {
                {1, 2}, {3, 4, 5}, {6}
        };
        // Переменная для хранения суммы всех элементов массива
        int summ = 0;

        // Проходим по каждой строке массива
        for (int[] miniGameScore : miniGameScores) {
            for (int i : miniGameScore) {
                summ = summ+i;
            }

        }System.out.println(summ);
        // Проходим по каждому элементу строки

        // Добавляем значение элемента к общей сумме


        // Выводим итоговую сумму на экран

    }
}