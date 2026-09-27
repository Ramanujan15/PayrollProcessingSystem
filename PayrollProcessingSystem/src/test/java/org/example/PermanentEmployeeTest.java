package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermanentEmployeeTest {

    private PermanentEmployee employee;
    @BeforeEach
    void setup(){
        employee=new PermanentEmployee("EMP101","Arun",3000.00,500.00,200.00);
    }

    @Test
    void calculateGrossSalary() {
        double result=employee.calculateGrossSalary();
        assertEquals(3700.00,result);
    }



    @Test
    void calculateDeduction() {
        double result= employee.calculateDeduction();
        assertEquals(370.00,result);
    }

    @Test
    void calculateNetSalary() {
        double result=employee.calculateNetSalary();
        assertEquals(3330.00,result);
    }
}