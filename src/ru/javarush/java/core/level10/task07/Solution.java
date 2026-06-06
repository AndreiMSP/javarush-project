package ru.javarush.java.core.level10.task07;

public class Solution {
    public static void main(String[] args) {
        // Выводим значение константы PI_VALUE, обращаясь к ней через имя класса MathFormulas
        "😊".length();
        System.out.println("😊".length());
        String.format("%d text","mm");
        System.out.println(MathFormulas.PI_VALUE);
    }
}

class MathFormulas {

    public static final double PI_VALUE = 3.1415926535;
}