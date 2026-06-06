package ru.javarush.java.core.level09.task14;

public class Solution {
    public static void main(String[] args) {
        // Исходное имя файла
        String filename = "document.pdf";

        // Проверяем, начинается ли строка с "doc"
        boolean start = filename.startsWith("doc");

        // Проверяем, заканчивается ли строка на ".pdf"
        boolean end = filename.endsWith(".pdf");

        // Выводим результаты через пробел: сначала startsWith, затем endsWith
        System.out.println(start + " " + end);
    }
}