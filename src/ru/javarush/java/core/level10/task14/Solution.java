package ru.javarush.java.core.level10.task14;

// Перечисление с четырьмя временами года
enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");

    private String ruName;

    Season(String ruName) {
        this.ruName = ruName;
    }

    public String getRuName() {
        return ruName;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Season и присваиваем ей значение SUMMER
        Season value = Season.SUMMER;
        System.out.println(value.getRuName());
        // Для каждого сезона выводим свое жизнерадостное сообщение
        switch (value) {
            case AUTUMN:
                System.out.println("Осень - пора красивого пейзажа!");
                break;
            case SPRING:
                System.out.println("Весна - пора готовиться к отдыху!");
                break;
            case SUMMER:
                System.out.println("Лето — время отпусков!");
                break;
            case WINTER:
                System.out.println("Пора кататься на лыжах!");
                break;
            default:
                System.out.println("Ошибочка вышла, повтори позже");
                break;
        }
    }
}