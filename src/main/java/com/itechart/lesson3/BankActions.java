package com.itechart.lesson3;

import com.itechart.lesson3.Bills.BaseBill;

import java.util.ArrayList;
import java.util.Scanner;

import static com.itechart.lesson3.User.replenishBalance;
import static com.itechart.lesson3.User.withdrawMoney;

public class BankActions {

    public static User createUser(String name, String surname, int id) {
        User user = new User(name, surname, id);
        user.setAccountId(user.getUserId());
        return user;
    }

    public static String readDataFromConsole() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        return s;
    }

    public static void showCurrentBillsBalance(ArrayList<BaseBill> billArrayList) {
        System.out.println("Текущее состояние счетов:");

        for (BaseBill item : billArrayList) {
            System.out.println(User.checkBalance(item));
        }
    }

    public static void modifyCurrentBillsBalance(ArrayList<BaseBill> billArrayList) {
        System.out.println("Выберите операцию (пополнить - 1,снять - 2):");
        String operation = readDataFromConsole();
        switch (operation) {
            case "1":
                System.out.println("Введите сумму для пополнения счета:");
                for (BaseBill item : billArrayList) {
                    replenishBalance(Integer.parseInt(BankActions.readDataFromConsole()), item);
                }
                break;
            case "2":
                System.out.println("Введите сумму для снятия счета:");
                for (BaseBill item : billArrayList) {
                    withdrawMoney(Integer.parseInt(BankActions.readDataFromConsole()), item);
                }
                break;
        }
    }
}
