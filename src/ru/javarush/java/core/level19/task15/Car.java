package ru.javarush.java.core.level19.task15;

public class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("Машина " + getModel() + " едет");
    }
}
