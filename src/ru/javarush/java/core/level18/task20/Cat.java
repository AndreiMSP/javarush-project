package ru.javarush.java.core.level18.task20;

public class Cat extends Animal {
    Cat(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println(name+": Мяу!");
    }
}
