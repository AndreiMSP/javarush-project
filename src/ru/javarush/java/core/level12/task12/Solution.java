package ru.javarush.java.core.level12.task12;

import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Определяем пути к файлам в текущей рабочей папке
        Path doc1 = Path.of("letters.bin");
        Path doc2 = Path.of("letters_copy.bin");


        // Считываем все байты исходного файла с помощью Files.readAllBytes
        byte[] mass = Files.readAllBytes(doc1);

        // Записываем байты в новый файл с помощью Files.write
        // Это создаст файл, если его нет, и перезапишет, если он уже существует
        Files.write(doc2, mass);
    }
}