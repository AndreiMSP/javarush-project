package ru.javarush.java.core.level11.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные согласно условию
        int divisor = 0;
        int totalEnergy = 100;
        // Попытка выполнить деление на ноль.
        // В момент вычисления этой строки произойдет ArithmeticException: / by zero
        int result = totalEnergy / divisor;


        // Попытка вывести результат деления (до этой строки выполнение не дойдет из-за исключения выше)
        System.out.println(result);
    }
}