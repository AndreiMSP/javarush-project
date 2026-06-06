package ru.javarush.java.core.level04.task16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры

        Scanner scanner = new Scanner(System.in);
        // Переменная для хранения суммы всех продаж
        int summ = 0;

        // Бесконечный цикл для ввода данных
        while (true) {
            // Запрашиваем сумму продажи
            System.out.println("Запрашиваем сумму продажи");
            // Считываем введенное число
            int sale = scanner.nextInt();

            // Если введено отрицательное число, выходим из цикла
            if (sale < 0) {
                break;
            }
            summ = summ + sale;
            // Добавляем положительное число к общей сумме

        }
        System.out.println(summ);
        // Выводим итоговую сумму всех продаж

    }
}