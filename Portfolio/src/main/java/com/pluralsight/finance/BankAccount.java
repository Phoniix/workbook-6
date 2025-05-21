package com.pluralsight.finance;

public class BankAccount implements Valuable {
    String name;
    String accNumber;
    double balance;

    // Constructor
    public BankAccount(String name, String accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // Custom Methods
    public void deposit (double amount) {
        this.balance += amount;
    }
    public void withdraw (double amount) {
        this.balance -= amount;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getAccNumber() {
        return accNumber;
    }
    public double getBalance() {
        return balance;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Imported method
    public double getValue() {
        return 0;
    }
}
