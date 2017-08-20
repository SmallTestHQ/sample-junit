package com.smalltest.sample.junit;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CAL_1_CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void CAL_2_testSum() {
        int result = calculator.sum(3, 4);
        assertEquals(7, result);
        assertThat("Sum is correct", result, equalTo(7));
    }

    @Test
    public void CAL_2_testSubstraction() {
        int result = calculator.subtraction(10, 2);
        assertThat("Difference is correct", result, equalTo(8));
    }
}
