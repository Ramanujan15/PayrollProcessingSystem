package org.example;


import java.util.ArrayList;
import java.util.List;

public class PayrollProcessingSystem {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new PermanentEmployee(
                "EMP101",
                "Arun",
                3000.00,
                500.00,
                200.00
        );

        Employee e2 = new ContractEmployee(
                "CR234",
                "Hari",
                3000.00,
                400.00
        );

        Employee e3 = new Manager(
                "MR126",
                "Ram",
                5000.00,
                800.00,
                300.00,
                1000.00
        );

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);


        // Payroll object for each Employee
        for (Employee employee : employees) {

            System.out.println("\n===============Payroll===============");

            Payroll p = new Payroll(employee);

            p.processPayroll();

            System.out.println("--------------Pay Slip----------------");
            p.generatePayslip();

            System.out.println("==============================");
        }
    }
}