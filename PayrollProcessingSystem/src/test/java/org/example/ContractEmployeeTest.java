package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setup(){
        employee=new ContractEmployee("CR234","Hari",3000.00,400.00);
    }
    @Test
    void calculateGrossSalary() {
        double result= employee.calculateGrossSalary();
        assertEquals(3400.00,result);

    }

    @Test
    void calculateDeduction() {
        double result= employee.calculateDeduction();
        assertEquals(170.00,result);
    }

    @Test
    void calculateNetSalary() {
        double result= employee.calculateNetSalary();
        assertEquals(3230.00,result);
    }
}