package ru.javarush.java.core.level03.task11;

public class Solution {
    public static void main(String[] args) {
        // Исходные условия (можно менять для проверки разных вариантов)
        boolean isSunny = true;
        boolean isWeekend = true;
        boolean canGoToPark;
        boolean canStayHome;
        // В парк идём только если одновременно солнечно И выходные
        if (isSunny == true && isWeekend == true) {
            canGoToPark = true;

        } else {
            canGoToPark = false;
        }


        // Остаёмся дома, если НЕ солнечно ИЛИ НЕ выходные
        if (isSunny == !true || isWeekend == !true) {
            canStayHome = true;

        } else {
            canStayHome = false;
        }
        // Вывод значений на экран
        System.out.println(canGoToPark);
        System.out.println(canStayHome);
    }
}