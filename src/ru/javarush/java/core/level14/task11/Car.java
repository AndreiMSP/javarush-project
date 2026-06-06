package ru.javarush.java.core.level14.task11;

public class Car {
    String carBrand;
    int carYear;

//    public Car(String carBrand, int carYear) {
//        this.carBrand = carBrand;
//        this.carYear = carYear;
//    }

    public void printCar() {
        System.out.println("Марка: " + carBrand + ", год выпуска: " + carYear);
    }
}
