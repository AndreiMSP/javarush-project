package ru.javarush.java.core.level05.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем сканер для чтения числа с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("заданному числу N");
        int pyramidHeight = scanner.nextInt();

        // Строим обелиск строка за строкой
        for (int i = 1; i <= pyramidHeight; i++) {
            // Количество пробелов слева: уменьшается от (N - 1) до 0
            int space = pyramidHeight - i;

            // Количество звездочек: растет по формуле (2 * row - 1)
            int star = 2 * i - 1;

            // Печатаем пробелы для выравнивания
            for (int x = 0; x < space; x++) {
                System.out.print(" ");
            }
            // Печатаем звездочки
            for (int y = 0; y < star; y++) {
                System.out.print("*");
            }
            System.out.println();// Переход на новую строку после каждой строки обелиска

        }
    }
}