package ru.javarush.java.core.level05.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Размер доски 8x8

        // Внешний цикл — по строкам
        for (int i = 0; i <= 7; i++) {


            // Внутренний цикл — по клеткам строки
            for (int j = 0; j <= 7; j++) {


                // Чередуем клетки по сумме индексов: чётная — "##", нечётная — "__"
                if ((i + j) % 2 == 0) {
                    System.out.print("##");
                } else {
                    System.out.print("__");
                }
            }System.out.println();
        }
        // Перенос строки после каждой строки доски (без лишних пробелов)

    }
}