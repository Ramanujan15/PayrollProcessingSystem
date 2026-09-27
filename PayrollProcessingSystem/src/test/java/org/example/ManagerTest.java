package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private Manager employee;

    @BeforeEach
    void setup(){
        employee = new Manager("MR126","Ram",5000.00,800.00,300.00,1000.00);
    }


    // If have many employess can use the ParameterizedTest  
    @ParameterizedTest
    @CsvSource({"5000.00,800.00,300.00,1000.00,7100",
                "6000.00,500.00,250.00,500.00,7250"})
    void calculateGrossSalary(double bs,double ha, double ta,double pb, double expected) {
        assertEquals(expected,bs+ha+ta+pb);

    }

    /*@Test
    void calculateGrossSalary() {
        double result= employee.calculateGrossSalary();
        assertEquals(7100.00,result);

    }*/

    @Test
    void calculateDeduction() {
        double result= employee.calculateDeduction();
        assertEquals(852.00,result);
    }

    @Test
    void calculateNetSalary() {
        double result= employee.calculateNetSalary();
        assertEquals(6248.00,result);
    }
}