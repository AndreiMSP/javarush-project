package ru.javarush.java.core.level14.task14;

import java.time.Duration;
import java.time.chrono.IsoChronology;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем анонимного пользователя (конструктор без параметров)
        User user = new User();


        // Регистрируем пользователя с именем "Алиса" (конструктор с одним параметром)
        User user1 = new User("Алиса");

        // Выводим значения полей каждого пользователя
        System.out.println(user.userName + " " + user.userAge);
        System.out.println(user1.userName + " " + user1.userAge);

    }
}