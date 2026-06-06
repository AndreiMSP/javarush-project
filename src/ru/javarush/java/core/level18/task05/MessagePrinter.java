package ru.javarush.java.core.level18.task05;

public class MessagePrinter {
    public void printMessage(String parm) {
        System.out.println(parm);
    }

    public void printMessage(int parm1, int parm2) {
        int summ = parm1 + parm2;
        System.out.println(summ);
    }
}
