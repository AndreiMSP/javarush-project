package ru.javarush.java.core.level09.task12;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя ввод названия продукта
        System.out.println("Введите название продукта:");
        String productName = console.nextLine();

        // Проверяем, начинается ли название с буквы 'E'
        if (productName.startsWith("E")) {
            String extract = productName.substring(0, 3);
            System.out.println(extract);
        }
        // Извлекаем первые три символа строки

        // Выводим аббревиатуру на экран


        // Выводим сообщение, если первая буква не 'E'
        else {
            System.out.println("Первая буква не E");
        }
    }
}