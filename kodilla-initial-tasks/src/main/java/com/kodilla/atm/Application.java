package com.kodilla.atm;

public class Application {
    public static void main (String[] args) {
        ATMImpl atm = new ATMImpl();
        atm.bankConnection();
        atm.cashPayment();
        atm.cashWithdrawal();
        System.out.println(ATM.endOfConnection());
    }
}
