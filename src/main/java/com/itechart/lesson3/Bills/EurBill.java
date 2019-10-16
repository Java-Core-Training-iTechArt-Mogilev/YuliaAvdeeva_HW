package com.itechart.lesson3.Bills;

public class EurBill extends BaseBill {

    public EurBill(double balance, int accountId) {
        super(balance, accountId);
    }

    @Override
    public String convertBalanceToString() {
        return Double.toString(getBalance()) + " EUR";
    }
}
