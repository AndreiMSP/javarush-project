package ru.javarush.java.core.level08.task09;

public class Solution {

    // Метод для генерации персонализированного приветствия
    public static String generateGreetingMessage(String recipientName) {
        // Формируем строку приветствия с использованием переданного имени
        //return
        return String.format("Привет, %s!", recipientName);
        //StringBuilder builder = new StringBuilder();
       // StringBuilder append = builder.append();
        //builder.append("Привет, ").append(recipientName).append("!");
        //return builder.toString();

    }

    public static void main(String[] args) {
        // Вызываем метод generateGreetingMessage с именем "Алиса"
        String greeting = generateGreetingMessage("Алиса");

        // Выводим результат на экран
        System.out.println(greeting);
    }
}