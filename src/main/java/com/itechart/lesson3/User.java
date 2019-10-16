package com.itechart.lesson3;

import com.itechart.lesson3.Bills.BaseBill;
import com.itechart.lesson3.Bills.BynBill;
import com.itechart.lesson3.Bills.EurBill;
import com.itechart.lesson3.Bills.UsdBill;

public class User {

    private String name;
    private String surname;
    private int userId;
    private int accountId;

    User(String name, String surname, int userId) {
        this.name = name;
        this.surname = surname;
        this.userId = userId;
        this.accountId = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getUserId() {
        return userId;
    }

    public void setAccountId(int userId) {
        if (this.accountId == 0) {
            this.accountId = this.userId;
        }
    }

    public BaseBill createBill(String currency) {

        BaseBill bill = new BaseBill();
        switch (currency) {
            case ("BYN"):
                bill = new BynBill(0.0, this.accountId);
                break;
            case ("EUR"):
                bill = new EurBill(0.0, this.accountId);
                break;
            case ("USD"):
                bill = new UsdBill(0.0, this.accountId);
                break;
        }
        return bill;
    }

    public static String checkBalance(BaseBill bill) {
        return bill.convertBalanceToString();
    }

    public static void replenishBalance(double sum, BaseBill bill) {
        double currentBalance = bill.getBalance();
        bill.setBalance(currentBalance += sum);
    }

    public static void withdrawMoney(double sum, BaseBill bill) {
        double currentBalance = bill.getBalance();
        if (sum > currentBalance) {
            bill.setBalance(0.0);
        } else {
            bill.setBalance(currentBalance -= sum);
        }
    }
}
