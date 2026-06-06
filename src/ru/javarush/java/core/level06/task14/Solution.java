package ru.javarush.java.core.level06.task14;

import javax.imageio.ImageTranscoder;

public class Solution {
    public static void main(String[] args) {
        // Исходная цена эликсира с налогом
        double elixirPriceWithTax = 17.34567;
        double displayprice;
        // Округляем до двух знаков после запятой:
        // Умножаем на 100, округляем с помощью Math.round, затем делим на 100.0
        displayprice = elixirPriceWithTax * 100;
        displayprice = Math.round(displayprice);
        displayprice = displayprice / 100.0;

        // Выводим округлённую цену на экран
        System.out.println(displayprice);
    }
}