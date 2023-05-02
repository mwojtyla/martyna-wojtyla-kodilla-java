package com.kodilla.bankingtransaction;

public class ATM extends Bank {
    protected void cardInsertRequest(){
        System.out.println("Put in the card.");
    }
    protected void pinCodeRequest(){
        System.out.println("Enter the pin code.");
    }
    protected void amountWithdrawRequest(){
        System.out.println("Enter the amount to withdraw.");
    }
    protected void cashWithdraw(){
        System.out.println("The cash is withdrawing.");
    }
    protected void bankThanks(){
        System.out.println("Thank you for using our bank's services. Have a nice day!");
    }
}
