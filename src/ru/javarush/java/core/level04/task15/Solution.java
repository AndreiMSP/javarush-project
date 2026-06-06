package ru.javarush.java.core.level04.task15;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести целое число больше 1
        System.out.println("ввести целое число больше 1");
        int numb = scanner.nextInt();
        boolean flag = true;
        // Проверяем, является ли число простым


        // Цикл для поиска первого делителя числа n
        for (int i = 2; i <= numb - 1; i++) {
            if (numb % i == 0) { // Если n делится на i без остатка
                // Выводим первый найденный делитель
                System.out.println(i);
                // Устанавливаем флаг, что число не простое
                flag = false;
                // Завершаем цикл, так как делитель найден
                break;
            }
        }

        // Если делитель не найден, выводим, что число простое
        if (flag) {
            System.out.println("Число простое");
        }
    }
}