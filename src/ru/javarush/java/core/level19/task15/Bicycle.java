package ru.javarush.java.core.level19.task15;

public class Bicycle extends Vehicle {
    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("Велосипед " + getModel() + " едет");
    }
}
