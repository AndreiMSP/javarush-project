package ru.javarush.java.core.level03.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и присваиваем счёт нашей команды и соперника
        int ourScore = 1;
        int opponentScore = 34;
        boolean weWon;

        // weWon — результат логического сравнения: true, если наш счёт больше
        if (ourScore > opponentScore) {
            weWon = true;
        }
        else {
            weWon = false;
        }

        // Выводим значение переменной weWon на экран
        System.out.println(weWon);
    }
}