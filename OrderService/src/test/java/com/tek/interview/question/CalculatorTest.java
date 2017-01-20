package com.tek.interview.question;

import static org.junit.Assert.assertEquals;

import java.math.RoundingMode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator underTest;

    @After
    public void tearDown() {
        underTest = null;
    }

    @Before
    public void setUp() {
        underTest = new Calculator();
    }

    @Test
    public void testRounding() {
        underTest = new Calculator();
        double value = 2.89753 * 0.15;
        RoundingMode rm = RoundingMode.HALF_EVEN;
        double expected = 0.43d;
        double actual = underTest.rounding(value, rm);
        assertEquals(expected, actual, 0.0);
    }

}
