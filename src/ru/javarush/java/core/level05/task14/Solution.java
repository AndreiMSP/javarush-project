package ru.javarush.java.core.level05.task14;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Стартовые очки здоровья
        int knightHp = 100;
        int dragonHp = 50;

        // Дракон загадывает скрытый максимум удара 2..20
        Random rand = new Random();
        int dragonMax = rand.nextInt(19) + 2;

        // Ввод силы удара рыцаря
        Scanner console = new Scanner(System.in);
        System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");

        // Основной боевой цикл
        while (true) {
            // Ход рыцаря: промах, если превышает скрытый максимум
            int damage = console.nextInt();
            if (damage < 1 || damage > dragonMax) {
                damage = 0;

            }
            dragonHp = dragonHp - damage;


            // Проверяем смерть дракона
            if (dragonHp <= 0) {
                System.out.println("Рыцарь победил!");
                break;
            }

            // Ход дракона: первая голова атакует
            knightHp = knightHp - rand.nextInt(1, 11);
            // Ход дракона: вторая голова атакует
            knightHp = knightHp - rand.nextInt(1, 11);

            // Текущий статус и проверка смерти рыцаря
            System.out.println("Жизни рыцаря: " + knightHp);
            System.out.println("Жизни дракона: " + dragonHp);

            if (knightHp <= 0) {
                System.out.println("Дракон победил!");
                break;
            }
        }
    }
}