package ru.javarush.java.core.level08.task08;

public class ShapeDesigner {

    // Статический метод, который выводит характеристики прямоугольника
    public static void printRectangleSpecs(int rectangleWidth, int rectangleHeight) {
//        System.out.println("Характеристики прямоугольника: ширина = " + rectangleWidth + ", высота = " + rectangleHeight);
        System.out.printf("Характеристики прямоугольника: ширина = %d, высота = %d%n", rectangleWidth, rectangleHeight);
    }

    public static void main(String[] args) {
        // Демонстрация работы метода с тремя наборами параметров
        printRectangleSpecs(5, 10);
        printRectangleSpecs(3, 7);
        printRectangleSpecs(12, 4);
    }
}