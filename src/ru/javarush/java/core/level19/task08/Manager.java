package ru.javarush.java.core.level19.task08;

public class Manager extends Employee {
    private double baseSalary;

    public Manager(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }

}
