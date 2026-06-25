package ru.javarush.java.core.level19.task11;

public class TopManager extends  Employee {

    private int count;

    public TopManager(String name, int count) {
        super(name);
        this.count = count;
    }

    //    @Override
    public double getSalary() {
        return 0;
    }


}

