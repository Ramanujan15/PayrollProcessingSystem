package org.example;
public class Manager extends PermanentEmployee{

    private double performanceBonus;

    public Manager(String employeeId, String employeeName, double basicSalary, double houseAllowance, double transportAllowance,double performanceBonus) {
        super(employeeId, employeeName, basicSalary, houseAllowance, transportAllowance);
        this.performanceBonus=performanceBonus;
    }

    public double getPerformanceBonus() {
        return performanceBonus;
    }

    public void setPerformanceBonus(double performanceBonus) {
        this.performanceBonus = performanceBonus;

    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary()+ getHouseAllowance() + getTransportAllowance() +performanceBonus;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary()*0.12;
    }

    @Override
    public double calculateNetSalary() {
        return calculateGrossSalary()-calculateDeduction();
    }
    public void displayManagerDetails(){
        System.out.println("Manager Details");
        super.displayEmployeeDetails();
        System.out.println("Performance Bonus:"+performanceBonus);
        System.out.println("Gross salary:"+calculateGrossSalary());
        System.out.println("Deduction:"+calculateDeduction());
        System.out.println("Net salary:"+calculateNetSalary());
        System.out.println("==============================================");

    }
}
