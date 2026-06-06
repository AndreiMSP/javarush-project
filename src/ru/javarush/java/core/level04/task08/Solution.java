package ru.javarush.java.core.level04.task08;

public class Solution {
    public static void main(String[] args) {
        // Используем цикл for для одновременного изменения двух переменных
        for (int i = 0; i < 5; i++) {
            // На каждой итерации выводим текущие значения x и y через пробел
            int x = 1;
            x = x + i;
            int y = 5;
            y = y - i;
            System.out.println(x +" " + y);
        }
    }
}