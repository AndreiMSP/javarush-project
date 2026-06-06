package ru.javarush.java.core.level09.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной фразой
        StringBuilder phrase = new StringBuilder("Привет, мир!");

        // Находим позицию запятой
        int numPosition = phrase.indexOf(",");


        // В исходной строке после запятой стоит пробел,
        // поэтому вставляем после запятой и пробела (+2)

        phrase.insert(8,"Java ");

        System.out.println(phrase);

        // Вставляем подстроку "Java " (с пробелом в конце)


        // Выводим результат

    }
}