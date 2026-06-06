package ru.javarush.java.core.level15.task03;

public class Person {
    String memberName;
    int memberAge;

    public Person(String memberName, int memberAge) {
        this.memberName = memberName;
        this.memberAge = memberAge;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberName(String newName) {
        memberName = newName;
    }

    public void setMemberAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
        } else {
            memberAge = newAge;

        }
    }

}
