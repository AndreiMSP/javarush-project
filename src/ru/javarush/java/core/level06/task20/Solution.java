package ru.javarush.java.core.level06.task20;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int для оценки за контрольную
        int quizScore = 4;
        double projectScore = 2.7;
        // Объявляем переменную типа double для оценки за проект
        double exactCourseAverage = (quizScore + projectScore) / 2;

        // Вычисляем точный средний балл (double) и сохраняем в exactCourseAverage


        // Преобразуем точный средний балл (double) в целое число (int) и сохраняем в roundedCourseAverage
        int roundedCourseAverage = (int) exactCourseAverage;

        // Выводим точный средний балл на экран


        // Выводим округленный средний балл на экран
        System.out.println(exactCourseAverage + " " + roundedCourseAverage);
    }
}