package ru.javarush.java.core.level07.task08;

public class Solution {
    public static void main(String[] args) {
        // Быстрая инициализация массива с 6 элементами температур
        int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};

        // Предполагаем, что первый элемент массива является максимальным
        int tempMax = hourlyTemperatures[1];

        // Проходим по всем элементам массива, начиная со второго
        for (int i = 1; i < hourlyTemperatures.length; i++) {


            // Если текущая температура больше сохранённой максимальной
            if (hourlyTemperatures[i] > tempMax) {
                tempMax = hourlyTemperatures[i];
            }
            // Обновляем максимальную температуру
        }
        System.out.println(tempMax);
        // Выводим найденную максимальную температуру

    }
}