package ru.javarush.java.core.level06.task15;

import java.text.DecimalFormat;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную для квартального дохода и присваиваем ей значение
        double quarterlyRevenue = 324.2;

        // Создаем форматер, который всегда выводит ровно две цифры после запятой
        // Шаблон "0.00" гарантирует наличие хотя бы одной цифры до запятой и двух после
        DecimalFormat shablon = new DecimalFormat("#.00");


        // Форматируем число и выводим результат на экран
        System.out.println(shablon.format(quarterlyRevenue));
    }
}