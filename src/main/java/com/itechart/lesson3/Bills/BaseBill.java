package com.itechart.lesson3.Bills;

public class BaseBill {

    private double balance;
    private int accountId;

    public BaseBill(double balance, int accountId) {
        this.balance = balance;
        this.accountId = accountId;
    }

    public BaseBill() {
        this(0.0, 0);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String convertBalanceToString() {
        return Double.toString(getBalance());
    }
}
