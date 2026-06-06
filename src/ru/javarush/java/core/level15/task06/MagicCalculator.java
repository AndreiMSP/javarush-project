package ru.javarush.java.core.level15.task06;

public class MagicCalculator {


    public int addNumbers(int firstNumber, int secondNumber) {
        int calculationResult = firstNumber + secondNumber;
        displayInternalResult(calculationResult);
        return calculationResult;
    }

    private void displayInternalResult(int calculationResult) {
        System.out.println("Внутренний результат: " + calculationResult);
    }
}
