package ru.javarush.java.core.level10.task09;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения числа с клавиатуры
        Scanner console = new Scanner(System.in);
        int day = console.nextInt();
        String dayName;
        // Используем классический switch для определения дня недели
        switch (day) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            default:
                dayName = "Неизвестный день";
                break;
        }
        System.out.println(dayName);
    }
}