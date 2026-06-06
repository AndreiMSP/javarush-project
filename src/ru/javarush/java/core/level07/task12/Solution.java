package ru.javarush.java.core.level07.task12;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем двумерный массив для хранения показаний (2 строки, 5 столбцов)
        int[][] sensorData = new int[2][5];
        int numb = 10;
        // Начальное значение для заполнения массива
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {

                sensorData[i][j] = numb;
                numb++;
            }
        }
        int[] array = new int[5];
        Arrays.fill(array, ++numb);
        System.out.println(Arrays.toString(array));
        // Заполняем массив по строкам, слева направо


        // Выводим массив в виде таблицы
//        for (int i = 0; i < sensorData.length; i++) {
//            for (int j = 0; j < sensorData[i].length; j++) {
//                if (j != sensorData[i].length - 1) {
//                    System.out.print(sensorData[i][j] + " ");
//                } else {
//                    System.out.print(sensorData[i][j]);
//                }
//            }
//            System.out.println();
//        }

        for (int i = 0; i < sensorData.length; i++) {
            StringBuilder string = new StringBuilder();
            for (int j = 0; j < sensorData[1].length; j++) {
                 string.append(sensorData[i][j]).append(" ");
            }
            System.out.println(string.toString().trim());
        }


        // Печатаем значение элемента

        // Если это не последний элемент в строке, добавляем пробел


        // После каждой строки переходим на новую


    }
}