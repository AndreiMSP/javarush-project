package ru.javarush.java.core.level19.task17;

public class SimpleTask extends Task{
    @Override
    public void complete() {
        System.out.println("Задача '" + getTitle() +"' выполнена");
    }
}
