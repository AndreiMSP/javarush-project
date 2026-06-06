package ru.javarush.java.core.level09.task20;

public class Solution {
    public static void main(String[] args) {
        // Инициализация стартовой фразы в StringBuilder
        StringBuilder start = new StringBuilder("Я люблю Java!");

        // Удаление слова "люблю" с сохранением пробелов
        start.delete(start.indexOf("люблю"),(start.indexOf("люблю")+"люблю ".length()));
        //System.out.println(start);

        start.replace(start.indexOf("Java"),(start.indexOf("Java")+"Java".length()),"программирование");
        System.out.println(start);
        // Замена слова "Java" на "программирование"


        // Вывод обновленной фразы на экран

    }
}