package ru.javarush.java.core.level07.task16;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив с заданным количеством элементов в каждой строке
        // Зона A: три датчика
        // Зона B: два датчика
        // Зона C: четыре датчика
        int[][] zoneTemperatures = {
                {22, 25, 20},
                {23, 21},
                {45, 46, 12, 23}
        };
        // Инициализируем переменную для хранения максимального значения
        int max = 0;

        // Проходим по всем элементам зубчатого массива
        for (int[] zoneTemperature : zoneTemperatures) {
            for (int i : zoneTemperature) {
                if (i > max) {
                    max = i;
                }
            }

        }
//        for (int i = 0; i < zoneTemperatures.length; i++) {
//            for (int j = 0; j < zoneTemperatures[i].length; j++) {
//                if (zoneTemperatures[i][j] > max) {
//                    max = zoneTemperatures[i][j];
//                }
//            }
//        }
        System.out.println(max);

        // Обновляем максимальное значение, если текущая температура больше


        // Выводим максимальное значение температуры на экран

    }
}