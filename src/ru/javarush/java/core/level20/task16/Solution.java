package ru.javarush.java.core.level20.task16;

public class Solution {
    public static void main(String[] args) {
        // Лямбда-реализация: преобразует строку к нижнему регистру
        class MyStringTransform implements StringTransformer {

            @Override
            public String transform(String s) {
                return s.toLowerCase();
            }
        }

        StringTransformer stringTransformer = new MyStringTransform();

//        StringTransformer stringTransformer = new StringTransformer() {
//            @Override
//            public String transform(String s) {
//                return s.toLowerCase();
//            }
//        };
//        StringTransformer stringTransformer = s -> s.toLowerCase();

        // Вызываем default-метод для строки "JAVA ROCKS"
        String javaRocks = stringTransformer.transform("JAVA ROCKS");
        System.out.println(javaRocks);
        stringTransformer.printTransformed("JAVA ROCKS");
    }
}