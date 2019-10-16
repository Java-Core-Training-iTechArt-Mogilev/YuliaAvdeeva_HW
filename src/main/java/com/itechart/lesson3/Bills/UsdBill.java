package com.itechart.lesson3.Bills;

public class UsdBill extends BaseBill {

    public UsdBill(double balance, int accountId) {
        super(balance, accountId);
    }

    @Override
    public String convertBalanceToString() {
        return Double.toString(getBalance()) + " USD";
    }
}
