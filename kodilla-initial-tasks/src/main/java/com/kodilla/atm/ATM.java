package com.kodilla.atm;

interface ATM {
    public void cashPayment();
    public void cashWithdrawal();

    default void bankConnection(){
        System.out.println("You are connected with the Bank.");
    }

    static String endOfConnection(){
        return "The ATM has finished the operation.";
    }
}
