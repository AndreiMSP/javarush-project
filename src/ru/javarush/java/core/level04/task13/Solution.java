package ru.javarush.java.core.level04.task13;

public class Solution {
    public static void main(String[] args) {
        // Перебираем числа от 1 до 10 включительно
        for (int i = 1/* инициализация */; i <= 10/* условие */; i++ /* изменение */) {
            // Проверяем, является ли текущее число верным кодом
            if (i == 5/* условие */) {
                // Если код найден, выводим сообщение
                System.out.println("Код найден! Замок открыт");
                // Прерываем цикл, так как код найден
                break;
            }
        }
    }
}
