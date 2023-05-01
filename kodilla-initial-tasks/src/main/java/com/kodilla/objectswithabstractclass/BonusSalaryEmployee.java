package com.kodilla.objectswithabstractclass;

public class BonusSalaryEmployee implements Employee {
    private double salary;
    private double bonus;

    public BonusSalaryEmployee(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return this.salary + this.salary * this.bonus/100;
    }
}

