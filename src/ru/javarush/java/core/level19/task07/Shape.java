package ru.javarush.java.core.level19.task07;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public String getName() {
        return name;
    }
}
