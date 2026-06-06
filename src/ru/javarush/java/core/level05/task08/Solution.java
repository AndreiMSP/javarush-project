package ru.javarush.java.core.level05.task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаём Scanner для чтения данных с клавиатуры
        Scanner scanner = new Scanner(System.in);


        // Считываем три целых числа — длительности трёх путей в минутах
        int pathOne = scanner.nextInt();
        int pathTwo = scanner.nextInt();
        int pathThree = scanner.nextInt();

        // Определяем минимальную длительность среди трёх значений
        int min = Math.min(pathOne,Math.min(pathTwo,pathThree));
        // Выводим результат
        System.out.println(min);
    }
}