package ru.javarush.java.core.level14.task11;

// Класс-шаблон для автомобиля: хранит марку и год выпуска


public class Solution {
    public static void main(String[] args) {
        // Создаем два независимых объекта класса Car с помощью new
        Car car1 = new Car();
        Car car2 = new Car();

        // Инициализируем поля первого автомобиля
        car1.carBrand = "Toyota";
        car1.carYear = 2024;
        // Инициализируем поля второго автомобиля
        car2.carBrand = "Volvo";
        car2.carYear = 2020;

        // Выводим информацию о каждом автомобиле в требуемом формате
        car1.printCar();
        car2.printCar();
    }
}