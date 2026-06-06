package ru.javarush.java.core.level14.task13;

public class Book {
    String bookTitle;
    int pageCount;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        pageCount = 0;
    }

    public Book(String bookTitle, int pageCount) {
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
    }

    public void printBookInf() {
        System.out.println(bookTitle + " " + pageCount);
    }
}
