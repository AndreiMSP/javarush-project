package ru.javarush.java.core.level19.task11;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public String getName() {
        return name;
    }
}
