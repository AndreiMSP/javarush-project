package ru.javarush.java.core.level14.task10;

public class Dog {
    // Поля с основной информацией о собаке
    String dogName;
    int dogAge;

    // Конструктор "регистрации": сразу присваиваем имя и возраст
    public Dog(String dogName, int dogAge) {
        this.dogAge = dogAge;
        this.dogName = dogName;
    }

    public void print() {
        System.out.println("Собаку зовут " + dogName + ", ей " + dogAge + " лет");
    }

    public static void main(String[] args) {
        // "Поступление" новой собаки в приют: задаём имя и возраст через конструктор
        Dog dog = new Dog("Шарик", 5);

        // Торжественное объявление о прибытии
        dog.print();
    }
}