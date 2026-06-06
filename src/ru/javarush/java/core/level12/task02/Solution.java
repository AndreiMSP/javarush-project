package ru.javarush.java.core.level12.task02;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список строк (названия фруктов)
        ArrayList<String> fruit = new ArrayList<>();

        // Добавляем исходные фрукты в заданном порядке
        fruit.add("Яблоко");
        fruit.add("Банан");
        fruit.add("Апельсин");

        // Заменяем второй элемент ("Банан") на "Груша"
        fruit.set(1, "Груша");

        // Удаляем первый элемент ("Яблоко")
        fruit.remove(0);

        // Выводим оставшиеся фрукты, каждый на новой строке
        for (String string : fruit) {
            System.out.println(string);
        }
    }
}