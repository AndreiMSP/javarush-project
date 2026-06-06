package ru.javarush.java.core.level13.task20;

import java.time.LocalDate;
import java.time.Period;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate для даты постройки здания: 20 марта 2000 года
        LocalDate constructionDate = LocalDate.of(2000, 3, 20);

        // Получаем текущую дату
        LocalDate today = LocalDate.now();

        // Вычисляем полный период между датой постройки и сегодняшним днем
        Period buildingAgePeriod = Period.between(constructionDate, today);

        // Форматируем и выводим результат в формате "Возраст: X лет, Y месяцев, Z дней"
        System.out.println("Возраст: " + buildingAgePeriod.getYears() + " лет, " + buildingAgePeriod.getMonths() + " месяцев, " + buildingAgePeriod.getDays() + " дней");
    }
}