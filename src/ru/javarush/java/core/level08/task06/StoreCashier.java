package ru.javarush.java.core.level08.task06;

public class StoreCashier {

    // Статический метод, который принимает цены двух товаров,
    // суммирует их и выводит результат
    public static void calculateAndShowCost(int firstItemPrice, int secondItemPrice) {
        int summ = firstItemPrice + secondItemPrice;
        System.out.println("Общая стоимость покупки: "+summ);
    }

    public static void main(String[] args) {
        // Тест: имитируем покупку товаров по цене 7 и 5
        calculateAndShowCost(7, 5);
    }
}