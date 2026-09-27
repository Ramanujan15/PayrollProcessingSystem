package org.example;
public class PermanentEmployee extends Employee{

    private double houseAllowance;
    private double transportAllowance;
    public PermanentEmployee(String employeeId, String employeeName, double basicSalary,double houseAllowance,double transportAllowance) {
        super(employeeId, employeeName, basicSalary);
        this.houseAllowance=houseAllowance;
        this.transportAllowance=transportAllowance;
    }

    public double getHouseAllowance() {
        return houseAllowance;
    }

    public void setHouseAllowance(double houseAllowance) {
        this.houseAllowance = houseAllowance;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary()+houseAllowance+transportAllowance;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary()*0.10;
    }

    @Override
    public double calculateNetSalary() {
        return calculateGrossSalary()-calculateDeduction();
    }

    public void displayPermanentEmployeeDetails(){
        System.out.println("Permanent details");
        super.displayEmployeeDetails();
        System.out.println("House allowance:"+houseAllowance);
        System.out.println("Transport allowance:"+transportAllowance);
        System.out.println("GrossSalary:"+calculateGrossSalary());
        System.out.println("Deduction:"+calculateDeduction());
        System.out.println("NetSalary:"+calculateNetSalary());
        System.out.println("==================================================");
    }
}
