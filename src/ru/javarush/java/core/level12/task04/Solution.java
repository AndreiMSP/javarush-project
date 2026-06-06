package ru.javarush.java.core.level12.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строк из консоли
        Scanner scanner = new Scanner(System.in);
        String string;
        // Динамический список для хранения задач
        ArrayList<String> task = new ArrayList<>();

        // Считываем строки до тех пор, пока не введена пустая строка
        while (!(string = scanner.nextLine()).equals("")) {
            task.add(string);
        }
        // читаем очередную задачу
        // пустая строка — сигнал завершения ввода
        for (int i = task.size() - 1; i >= 0; i--) {
            System.out.println(task.get(i));
        }
        // добавляем задачу в список


        // Выводим задачи в обратном порядке: от последней к первой
        //System.out.println(task);

    }
}