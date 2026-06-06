package ru.javarush.java.core.level12.task08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Исходный текст для анализа
        String textContent = "java core java map";

        // Создаем HashMap для хранения статистики слов
        HashMap<String, Integer> statData = new HashMap<>();

        // Разбиваем текст на слова, используя пробел как разделитель
        for (String string : textContent.split(" ")) {
            if (!statData.containsKey(string)) {
                statData.put(string, 1);
            } else {
                Integer integer = statData.get(string);
                statData.put(string, integer + 1);
            }
        }
        // Подсчитываем количество вхождений каждого слова

        // Получаем значение из словаря


        // Если слово уже есть в HashMap, увеличиваем его счетчик


        // Выводим результаты подсчета на экран
        Set<Map.Entry<String, Integer>> entries = statData.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : statData.entrySet()) {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            System.out.println(key + ": "+value);
        }


    }
}