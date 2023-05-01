package com.kodilla.objectswithabstractclass;

public class Application {
    public static void main(String args[]) {

        AcordSalaryEmployee employee = new AcordSalaryEmployee(5,950);
        BonusSalaryEmployee employee1 = new BonusSalaryEmployee(2000,20);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();

        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employee1);
        processor1.processPayout();
    }
}
