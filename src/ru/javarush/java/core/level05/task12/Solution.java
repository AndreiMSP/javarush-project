package ru.javarush.java.core.level05.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int dragonHp = 50;
        int knightHits = 10;
        Scanner console = new Scanner(System.in);
        System.out.print("Вы напали на спящего дракона - дракон расстроился");

        // цикл боя
        while (knightHits > 0 && dragonHp > 0) {
            // Игрок указывает силу удара
            System.out.print("Сила удара (1-10): ");
            int damage = console.nextInt();
            // Если слишком сильно или слишком слабо - то промах
            if (damage < 1 || damage > 10) {
                continue;
            }

            // отнимаем жизнь у дракона и ход у игрока
            dragonHp = dragonHp - damage;
            knightHits = knightHits - 1;

            // проверка, что дракон побежден


        }

        if (dragonHp <= 0) {
            System.out.println("Дракон повержен!");
        } else if (knightHits == 0 && dragonHp > 0) {
            System.out.println("Рыцарь проиграл!");
            //проверка, что рыцарь проиграл

        }
    }
}