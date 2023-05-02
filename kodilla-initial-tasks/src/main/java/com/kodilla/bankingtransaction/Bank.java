package com.kodilla.bankingtransaction;

abstract class Bank {
    private void withdrawalAcceptation(){
        System.out.println("The withdrawal request has been accepted.");
    }
    private void accountBalance(){
        System.out.println("The account balance has been checked.");
    }
    private void withdrawalConfirm(){
        System.out.println("You can withdraw the money.");
    }

    abstract protected void cardInsertRequest();
    abstract protected void pinCodeRequest();
    abstract protected void amountWithdrawRequest();
    abstract protected void cashWithdraw();
    abstract protected void bankThanks();

    public void transaction(){
        this.cardInsertRequest();
        this.pinCodeRequest();
        this.amountWithdrawRequest();
        this.withdrawalAcceptation();
        this.accountBalance();
        this.withdrawalConfirm();
        this.cashWithdraw();
        this.bankThanks();
    }
}
