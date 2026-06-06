package ru.javarush.java.core.level05.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строки с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String ancientRiddle = scanner.nextLine();
        StringBuilder revers = new StringBuilder(ancientRiddle).reverse();

        // Проверяем палиндром двумя указателями: с начала и с конца


        for (int i = 0; i <= ancientRiddle.length() - 1; i++) {

            // Проверка чувствительна к регистру, сравниваем символы напрямую
            if (Character.isUpperCase(ancientRiddle.charAt(i))) {

                break; // Дальше проверять не нужно
            }
        }
        if (ancientRiddle.equals(revers.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // Вывод строго "YES" или "NO" без дополнительных сообщений

    }
}