package ru.javarush.java.core.level19.task18;

public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }


    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    protected void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void complete() {
        setCompleted(true);
        System.out.println("Задача " + getTitle() + " выполнена");
    }
}
