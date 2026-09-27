package org.example;

abstract class Employee {

    private String employeeId;
    private String employeeName;
    private double basicSalary;

    public abstract  double calculateGrossSalary();
    public abstract double calculateDeduction();
    public abstract double calculateNetSalary();

    public Employee(String employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void displayEmployeeDetails(){
        System.out.println("===Employee Details===");
        System.out.println("EmployeeID:"+employeeId);
        System.out.println("EmployeeName:"+employeeName);
        System.out.println("Basic Salary:"+basicSalary);
        System.out.println("================================");
    }


}
