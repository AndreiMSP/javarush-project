package ru.javarush.java.core.level19.task07;

public class Circle extends Shape {
    double radius;

    public Circle(String name2, double radius) {
        super(name2);
        this.radius = radius;

    }

    @Override
    public double area() {return Math.PI * radius * radius;
    }
}
