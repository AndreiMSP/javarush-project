package ru.javarush.java.core.level14.task12;

public class Solution {
    public static void main(String[] args) {
        // "Регистрируем" книгу без начальных данных — сработает конструктор по умолчанию
        Book book1 = new Book();

        // "Регистрируем" книгу с готовыми данными
        Book book2 = new Book("Java для начинающих", 350);

        // Показываем информацию о каждой книге в требуемом формате
        System.out.println(book1);
        System.out.println(book2);
    }
}