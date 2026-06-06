package ru.javarush.java.core.level07.task06;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив фиксированной длины 3 для любимых фильмов
        String[] favoriteMovies = new String[3];

        // Создаем Scanner для чтения строк с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем три названия фильмов и сохраняем по порядку в массив
        for (int i = 0; i < favoriteMovies.length; i++) {
            favoriteMovies[i] = scanner.nextLine();
        }

        // Выводим фильмы в обратном порядке: третий, второй, первый
        //Arrays.sort(favoriteMovies,favoriteMovies.length,0);
        for (int i = favoriteMovies.length-1; i >= 0; i--) {

            System.out.println(favoriteMovies[i]);
        }
    }
}