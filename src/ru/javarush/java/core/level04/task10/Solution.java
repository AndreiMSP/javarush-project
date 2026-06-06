package ru.javarush.java.core.level04.task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        int pass;
        // Используем do-while, чтобы запросить PIN хотя бы один раз
        // и повторять ввод, пока число не будет в диапазоне 1000..9999
        do {
            // Запрос ввода PIN-кода
            System.out.println("ввод PIN-кода");
            // читаем целое число
            pass = scanner.nextInt();
        } while (pass < 1000 || pass > 9999);

        // Выводим сообщение о принятии PIN-кода
        System.out.println("PIN-код принят");

    }
}