package com.itechart.lesson3.Bills;

public class BynBill extends BaseBill {

    public BynBill(double balance, int accountId) {
        super(balance, accountId);
    }

    @Override
    public String convertBalanceToString() {
        return Double.toString(getBalance()) + " BYN";
    }
}
