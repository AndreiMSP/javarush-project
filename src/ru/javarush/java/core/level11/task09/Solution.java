package ru.javarush.java.core.level11.task09;

public class Solution {
    public static void main(String[] args) {

        // Выполняем деление 10 на 2 и выводим результат

        try {
            int result = 10 / 2;

            System.out.println(result);
        } finally {


            // Сообщение о завершении работы робота, которое будет выведено всегда
            System.out.println("Робот завершил свою работу. Выполнение завершено.");
        }
    }
}