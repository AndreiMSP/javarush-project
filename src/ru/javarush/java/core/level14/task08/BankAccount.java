package ru.javarush.java.core.level14.task08;

public class BankAccount {
    String accountOwner;
    int accountBalance;
    int amount;

    public BankAccount(String accountOwner, int accountBalance) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        accountBalance = 0;
    }

    public void deposit(int amount) {
        accountBalance = accountBalance + amount;
    }

    public void printInfo() {
        System.out.println("Владелец: " + accountOwner + ", баланс: " + accountBalance);
    }
}
