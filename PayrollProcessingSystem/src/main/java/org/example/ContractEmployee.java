package org.example;

public class ContractEmployee extends Employee {

    private double contractBonus;

    public double getContractBonus() {
        return contractBonus;
    }

    public void setContractBonus(double contractBonus) {
        this.contractBonus = contractBonus;
    }

    public ContractEmployee(String employeeId, String employeeName, double basicSalary, double contractBonus) {
        super(employeeId, employeeName, basicSalary);
        this.contractBonus=contractBonus;
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary()+contractBonus;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary()*0.05;
    }

    @Override
    public double calculateNetSalary() {
        return calculateGrossSalary()-calculateDeduction();
    }

    public void displayContractEmployeeDetails(){
        System.out.println("Contract Details");
        super.displayEmployeeDetails();
        System.out.println("Contract Bonus:"+contractBonus);
        System.out.println("Gross salary:"+calculateGrossSalary());
        System.out.println("Deduction:"+calculateDeduction());
        System.out.println("Net salary:"+calculateNetSalary());
        System.out.println("==============================================");

    }
}
