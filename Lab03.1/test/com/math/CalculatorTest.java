/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
    // business object(s) under test = called a "fixture"
    private Calculator calc;

    @BeforeClass
    public static void initializeEntireTestRun() {
        System.out.println("initialize entire test run");
    }

    @AfterClass
    public static void finalizeEntireTestRun() {
        System.out.println("finalizeEntireTestRun");
    }

    @Before
    public void setUP() {
        System.out.println("setUP");
        calc = new Calculator();
    }

    @After
    public void cleanUp() {
        System.out.println("cleanUp");
    }

    @Test
    public void testIsEven() {
        System.out.println("is even");
        assertTrue(calc.isEven(10));
        assertFalse(calc.isEven(11));
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        assertEquals(2.5, calc.divide(5,2), .001); // the last argument is delta
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        assertEquals(5, calc.add(1, 4));  // expected, actual
    }


}