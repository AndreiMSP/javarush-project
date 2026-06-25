package ru.javarush.java.core.level19.task18;

import java.util.List;

public interface TaskRepository{
    void save(Task task);
    Task findByTitle(String title);
    List<Task> findAll();
}
