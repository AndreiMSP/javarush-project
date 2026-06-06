package ru.javarush.java.core.level05.task03;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        // Просим пользователя ввести строку (послание)
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести любую строку текста");
        String magicMessage = scanner.nextLine();
        // Разворачиваем строку с помощью цикла for
//        char[] array = magicMessage.toCharArray();
//        //Arrays.sort(array);
//        char[] array2 = new char[magicMessage.length()];
//        for (int i = 0; i < magicMessage.length(); i++) {
//            int num = magicMessage.length() - i - 1;
//            array2[i] = array[num];
//            }
//        // Выводим инвертированную строку
//        System.out.println(new String(array2));
        char[] array3 = new char[magicMessage.length()];
        for (int i = 0; i < magicMessage.length(); i++) {
            char charAt = magicMessage.charAt(magicMessage.length() - 1 - i);
            array3[i] = charAt;
        }
        System.out.println(array3);
    }
}