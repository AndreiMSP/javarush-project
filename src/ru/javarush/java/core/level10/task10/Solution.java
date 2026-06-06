package ru.javarush.java.core.level10.task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя с консоли
        Scanner console = new Scanner(System.in);
        String result;
        // Запрашиваем у пользователя ввод команды
        System.out.println("Введите команду (start, stop, exit):");
        String command = console.nextLine().trim(); // Убираем лишние пробелы по краям

        // Обрабатываем введенную команду с помощью классического switch
        switch (command) {
            case "start":
                result = "Запуск!";
                break;
            case "stop":
                result = "Остановка";
                break;
            case "exit":
                result = "Выход";
                break;
            default:
                result = "Неизвестная команда";
                break;
        }
        System.out.println(result);


    }
}