package ru.javarush.java.core.level14.task09;

public class Cat {
    String catName;
    int catAge;

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }
    public void print (){
        System.out.println(catName+" "+catAge);
    }
}
