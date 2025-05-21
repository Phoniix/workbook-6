package com.pluralsight.finance;

public class CreditCard implements Valuable{
    String name;
    String accNumber;
    double balance;

    public CreditCard(String name, String accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void charge (double amount) {
        this.balance += amount;
    }
    public void pay (double amount) {
        this.balance -= amount;
    }

    public double getValue() {
        return 0;
    }
}
