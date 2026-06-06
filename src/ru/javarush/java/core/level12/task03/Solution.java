package ru.javarush.java.core.level12.task03;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения имен гостей
        ArrayList<String> arrayList = new ArrayList<>();

        // Добавляем имена в список
        arrayList.add("Анна");
        arrayList.add("Иван");
        arrayList.add("Петр");
        arrayList.add("Мария");

        // Проверяем, содержится ли имя "Петр" в списке
        System.out.println(arrayList.contains("Петр"));


        // Проверяем, содержится ли имя "Сергей" в списке
        System.out.println(arrayList.contains("Сергей"));
    }
}