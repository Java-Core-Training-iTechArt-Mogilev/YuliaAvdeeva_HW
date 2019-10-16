package com.itechart;

import com.itechart.lesson3.BankActions;
import com.itechart.lesson3.Bills.BaseBill;
import com.itechart.lesson3.User;

import java.util.ArrayList;

import static com.itechart.lesson3.BankActions.readDataFromConsole;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Введите имя:");
        String name = readDataFromConsole();
        System.out.println("Введите фамилию:");
        String surname = readDataFromConsole();
        System.out.println("Введите ID:");
        int id = Integer.parseInt(readDataFromConsole());

        User user = BankActions.createUser(name, surname, id);

        System.out.println("Введите валюту для создания счета (BYN, EUR, USD):");
        BaseBill bill1 = user.createBill(readDataFromConsole());
        BaseBill bill2 = user.createBill(readDataFromConsole());
        BaseBill bill3 = user.createBill(readDataFromConsole());

        ArrayList<BaseBill> billArrayList = new ArrayList<BaseBill>();
        billArrayList.add(bill1);
        billArrayList.add(bill2);
        billArrayList.add(bill3);

        BankActions.showCurrentBillsBalance(billArrayList);
        BankActions.modifyCurrentBillsBalance(billArrayList);
        BankActions.showCurrentBillsBalance(billArrayList);
        BankActions.modifyCurrentBillsBalance(billArrayList);
        BankActions.showCurrentBillsBalance(billArrayList);
    }
}
