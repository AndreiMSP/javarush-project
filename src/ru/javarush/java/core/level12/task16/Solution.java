package ru.javarush.java.core.level12.task16;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HttpClient из стандартной библиотеки Java
        HttpClient httpClient = HttpClient.newHttpClient();
        URI uri = URI.create("https://httpbin.org/image/png");
        // Готовим GET-запрос на указанный URL
        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

        // Отправляем запрос и сразу получаем тело как массив байт
        HttpResponse<byte[]> response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());

        // Извлекаем тип содержимого из заголовка Content-Type
        String contentType = response.headers().firstValue("Content-Type").orElse("не определен");

        // Определяем размер файла по длине массива байт ответа
        byte[] body = response.body();
        int size = body.length;
        // Сначала выводим информацию о типе и размере
        System.out.println("Тип: " + contentType + ", Размер: " + size);

        // Только после вывода сохраняем изображение на диск
        Files.write(Path.of("image04.png"), body);
    }
}