package ru.javarush.java.core.level07.task14;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем зубчатый массив guestLists,
        // где каждая вложенная строка — список гостей за отдельным столом
        // Стол 1: два гостя
        // Стол 2: три гостя
        // VIP-стол 3: один гость
        String[][] guestLists =
                {
                        {"Анна", "Борис"},
                        {"Сергей", "Марина", "Габдулла"},
                        {"Альфред"}
                };

        // Внешний цикл for-each: перебираем каждый подмассив (каждый стол)
//        for (int i = 0; i < guestLists.length; i++) {
//           // Внутренний цикл for-each: выводим поочерёдно имена гостей текущего стола
//            for (int j = 0; j <guestLists[i].length; j++) {
//                System.out.print(guestLists[i][j]+" ");
//            }
//            System.out.println();
//        }
        // выводим имя и пробел
        for (String[] guestList : guestLists) {
            for (String s : guestList) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        // После вывода всех гостей одного стола — перевод строки


    }
}