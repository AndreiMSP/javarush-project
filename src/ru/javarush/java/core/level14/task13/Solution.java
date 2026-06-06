package ru.javarush.java.core.level14.task13;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем книгу, у которой пока есть только название
        Book book1 = new Book("Загадочный роман");


        // Регистрируем книгу с названием и количеством страниц
        Book book2 = new Book("Путешествие по космосу", 500);

        // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)
        book1.printBookInf();
        book2.printBookInf();
    }
}

// "Форма" для книги: хранит название и количество страниц