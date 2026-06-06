package ru.javarush.java.core.level07.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив (каждая "строка" может иметь свою длину)
        int[][] playerAchievements = {
                {101, 102},
                {103, 104, 105, 106},
                {107}
        };
        // 1-й уровень: 2 достижения
        // 2-й уровень: 4 достижения
        // 3-й (бонусный) уровень: 1 достижение
        for (int[] playerAchievement : playerAchievements) {
            for (int i : playerAchievement) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        // Выводим каждую строку массива на отдельной строке

        // Печатаем элементы строки, разделяя пробелом

        // перед первым элементом пробел не ставим


        // перенос строки после каждой "строки" массива


    }
}