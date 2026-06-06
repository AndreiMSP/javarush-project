package ru.javarush.java.core.level14.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Car с произвольными значениями марки и года выпуска
        Car car = new Car("VW", 2019);

        // Просим автомобиль "представиться"
        car.displayDetails();
    }
}

// Класс Car хранит марку и год выпуска и умеет выводить информацию о себе