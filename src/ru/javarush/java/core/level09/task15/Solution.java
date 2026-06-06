package ru.javarush.java.core.level09.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";

        // Сравниваем строки лексикографически:
        int f1 = first.compareTo(second);

        // Меняем значения переменных местами
        String temp = first;
        first = second;
        second = temp;

        // Повторяем сравнение после обмена
        int f2 = first.compareTo(second);
        System.out.println(f1 + " " + f2);
    }
}