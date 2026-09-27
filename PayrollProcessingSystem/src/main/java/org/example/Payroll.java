package org.example;
public class Payroll {
    private Employee employee;

    public Payroll(Employee employee) {
        this.employee = employee;
    }

    public void processPayroll(){
        System.out.println("Employee Name:"+employee.getEmployeeName());
        System.out.println("Gross Salary:"+employee.calculateGrossSalary());
        System.out.println("Deduction:"+employee.calculateDeduction());
        System.out.println("Net Salary:"+employee.calculateNetSalary());
    }
    public void generatePayslip(){
        System.out.println("Pay slip");
        employee.displayEmployeeDetails();
        System.out.println("Gross Salary:"+employee.calculateGrossSalary());
        System.out.println("Deduction:"+employee.calculateDeduction());
        System.out.println("Net Salary:"+employee.calculateNetSalary());
    }
}
