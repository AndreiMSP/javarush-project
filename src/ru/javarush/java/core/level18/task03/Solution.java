package ru.rush.java.core.level18.task03;


import ru.javarush.java.core.level18.task03.Developer;
import ru.javarush.java.core.level18.task03.Employee;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную базового типа
        Employee employee;

        // Присваиваем ей объект подкласса Developer
        employee = new Developer();

        // Полиморфный вызов: выполнится переопределённая версия из Developer
        employee.work(); // Ожидаемый вывод: "Разработчик пишет код."
    }
}