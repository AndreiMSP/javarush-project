package com.rush.java.core.level18.task02;

import ru.javarush.java.core.level18.task02.Animal;
import ru.javarush.java.core.level18.task02.Cat;
import ru.javarush.java.core.level18.task02.Cow;

public class Solution {
    public static void main(String[] args) {
        // Массив типа Animal хранит ссылки на разные конкретные животные.
        Animal[] pen = { new Cat(), new Cow() };

        // Полиморфизм: вызывается версия makeSound() конкретного объекта,
        // даже если переменная имеет тип базового класса Animal.
        for (Animal animal : pen) {
            animal.makeSound(); // Ожидаемый вывод: "Мяу!" затем "Мууу!"
        }
    }
}