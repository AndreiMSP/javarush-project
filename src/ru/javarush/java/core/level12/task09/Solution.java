package ru.javarush.java.core.level12.task09;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект Path для файла "note.txt" в текущей директории
        Path adr = Path.of("note.txt");
        Files.writeString(adr, "Сегодня отличный день!",StandardCharsets.UTF_8);
        // Строка, которую нужно записать в файл


        // Записываем строку в файл с использованием кодировки UTF-8

    }
}