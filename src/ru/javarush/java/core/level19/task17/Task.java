package ru.javarush.java.core.level19.task17;

public abstract class Task {
    private String title;

    public Task(String title) {
        this.title = title;
    }

    public abstract void complete();

     public String getTitle() {
        return title;    }
}
