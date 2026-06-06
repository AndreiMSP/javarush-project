package ru.javarush.java.core.level04.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с консоли
        Scanner scanner = new Scanner(System.in);


        // Сумма всех введенных стоимостей

        int summ = 0;

        // Запрашиваем первую стоимость чашки кофе
        int cup = scanner.nextInt();

        // Используем цикл while для продолжения ввода до тех пор, пока не будет введено отрицательное число
        while (cup >= 0) {
            // Добавляем введенную стоимость к общей сумме
            summ += cup;
            // Запрашиваем следующую стоимость
            System.out.println("Another price cup:");
            cup = scanner.nextInt();
        }

        // Выводим итоговую сумму расходов на кофе (отрицательное значение в сумму не входит)
        System.out.println(summ);
    }
}