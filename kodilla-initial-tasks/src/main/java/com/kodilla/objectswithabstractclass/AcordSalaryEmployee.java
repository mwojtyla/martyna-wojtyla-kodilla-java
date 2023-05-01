package com.kodilla.objectswithabstractclass;

public class AcordSalaryEmployee implements Employee {
    private double acordPay;
    private double productsAmount;

    public AcordSalaryEmployee(double acordPay, double productsAmount){
        this.acordPay = acordPay;
        this.productsAmount = productsAmount;
    }

    public double calculateSalary() {
        return this.acordPay * this.productsAmount;
    }
}
