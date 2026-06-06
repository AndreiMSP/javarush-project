package ru.javarush.java.core.level07.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаем двумерный массив строк 3x2 для отображения на табло
        String[][] displayGrid = new String[3][2];

        // Индексация в массивах начинается с нуля:
        // третья строка -> индекс 2, второй столбец -> индекс 1
        displayGrid[2][1] = "Hello";

        // Выводим элемент из третьей строки и второго столбца для проверки
        System.out.println(displayGrid[2][1]);
    }
}