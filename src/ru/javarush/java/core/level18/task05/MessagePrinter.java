package ru.javarush.java.core.level18.task05;

public class MessagePrinter {
    int summ;


    public void printMessage(String parm) {
        System.out.println(parm);
    }

    public void printMessage(int parm1, int parm2) {
        summ = parm1 + parm2;
        System.out.println(summ);
    }

    public void printMessage(int parm1, int parm2, int parm3) {
        int summ = parm1 + parm2 + parm3;
        System.out.println(summ);
    }
}
