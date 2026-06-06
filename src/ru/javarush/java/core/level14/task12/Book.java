package ru.javarush.java.core.level14.task12;

import java.nio.file.Path;

public class Book {
    private String bookTitle;
    private int numberOfPages;

    public Book() {
        bookTitle = "Без названия";
        numberOfPages = 0;
    }

    public Book(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Книга: " + bookTitle + ", страниц: " + numberOfPages;
    }
}
