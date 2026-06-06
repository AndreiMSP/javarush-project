package ru.javarush.java.core.level05.task20;

public class Solution {
    public static void main(String[] args) {
        // Внешний цикл для чисел от 1 до 10 (строки таблицы)
        for (int i = 1; i <= 10; i++) {


            // Внутренний цикл для чисел от 1 до 10 (столбцы таблицы)
            for (int j = 1; j <= 10; j++) {
                int number = i * j;
                System.out.print(number+"\t");
//                if (number < 10) {
//                    System.out.print("   " + number);
//                } else if (number <= 99) {
//                    System.out.print("  " + number);
//                } else  {
//                    System.out.print(" " + number);
//                }
            }
            System.out.println();
        }
        // Вывод произведения с разделителем табуляции


        // Переход на новую строку после завершения строки таблицы


    }
}