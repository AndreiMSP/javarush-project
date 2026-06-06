package ru.javarush.java.core.level07.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив длиной 10 элементов
        int[] roundScores = new int[10];

        // Заполняем массив числами от 1 до 10 с помощью цикла
        for (int i = 0; i < roundScores.length; i++) {
            roundScores[i] = i+1;
        }

        // Выводим все элементы массива в одну строку, разделяя их пробелом
        for (int i = 0; i < roundScores.length-1; i++) {
            System.out.print(roundScores[i]+" ");
        }
        System.out.println(roundScores[9]);
        // Выводим текущий элемент массива

        // Добавляем пробел между элементами, кроме последнего


    }
}