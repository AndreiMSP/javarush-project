package ru.javarush.java.core.level03.task16;

public class Solution {
    public static void main(String[] args) {
        // Исходные данные
        int yourAge = 25;
        boolean hasJob = true;
        boolean hasCreditHistory = false;
        boolean hasGuarantor = true;

        // Кредит одобрят, если (возраст > 21 и есть работа) ИЛИ (есть кредитная история и поручитель)
        boolean accept = (yourAge > 21 && hasJob) || (hasCreditHistory && hasGuarantor);

        // Кредит одобрят, если (возраст > 21) И (есть работа ИЛИ кредитная история) И (есть поручитель)
        boolean accept2 = yourAge > 21 && (hasJob || hasCreditHistory) && hasGuarantor;

        // Выводим результаты по двум правилам
        System.out.println(accept);
        System.out.println(accept2);
    }
}