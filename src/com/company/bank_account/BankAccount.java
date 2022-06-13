package com.company.bank_account;

//Класс - "Банковский счёт"
public class BankAccount {

    //поля
    private double balance; // баланс
    private int number; // номер счета
    private String currency; // валюта


    //Конструкторы
    // 1. Конструктор без параметров
    public BankAccount() {
        currency = "RUB";
        number = 1;
        balance = 0;
    }

    // 2. Конструктр с 2 параметрами
    public BankAccount(String currency, double value) {
        this.balance = value;
        this.currency = currency;
    }

    // 3. Конструктр с 3 параметрами
    public BankAccount(String currency, double value, int number) {
        this.balance = value;
        this.number = number;
        this.currency = currency;
    }

    //getters and setters

    public double getBalance() {
        return balance;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //метод toString

    @Override
    public String toString() {
        return String.format("Банковский счёт %d: %1.2f %s", number, balance, currency);
    }
}//class close
