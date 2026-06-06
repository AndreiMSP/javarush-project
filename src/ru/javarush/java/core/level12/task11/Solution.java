package ru.javarush.java.core.level12.task11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 1) Создаем массив байтов с ASCII-кодами букв H, I, J
        byte[] data = {72, 73, 74};

        // 2) Записываем массив в бинарный файл "letters.bin"
        Files.write(Path.of("letters.bin"), data);

        // 3) Читаем содержимое файла обратно в новый массив байтов
        byte[] buffer = Files.readAllBytes(Path.of("letters.bin"));

        // 4) Выводим каждый байт как символ, разделяя пробелами
        for (byte b : buffer) {
            System.out.print((char) b + " ");
        }
    }
}