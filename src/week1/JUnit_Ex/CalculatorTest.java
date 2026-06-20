package week1.JUnit_Ex;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2, 3));
    }
}
