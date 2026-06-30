package week1.JUnit_Ex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {

    private Calc calculator;

    @Before
    public void setUp() {
        System.out.println("Setup executed");
        calculator = new Calc();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown executed");
        calculator = null;
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }
}
