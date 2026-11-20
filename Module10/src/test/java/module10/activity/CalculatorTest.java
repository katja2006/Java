package module10.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        //Initialize calculator object
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        //Tear down calculator object (set to null)
        calculator = null;
    }

    @Test
    public void testAddIntegers() {
        //Test add two integers
        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    public void testAddDoubles() {
        //Test add two doubles
        double result = calculator.add(5.3, 1.7);

        assertEquals(7.0, result, 0.001);
    }

    @Test
    public void testAddNegativeIntegers() {
        //Test add two negative integers
        int result = calculator.add(-9, -1);

        assertEquals(-10, result);
    }

    @Test
    public void testAddNegativeDoubles() {
        //Test add two negative doubles
        double result = calculator.add(-2.4, -4.8);

        assertEquals(-7.2, result, 0.001);
    }

    @Test
    public void testSubtractFirstLarger() {
        //Test subtract if first number is larger
        int result = calculator.subtract(10, 4);

        assertEquals(6, result);
    }

    @Test
    public void testSubtractSecondLarger() {
        //Test subtract if second number is larger
        int result = calculator.subtract(4, 10);

        assertEquals(6, result);
    }

    @Test
    public void testDivideValid() {
        //Test divide two valid integers
        int result = calculator.divide(10, 2);

        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero() {
        //Test divide by zero
        int result = calculator.divide(4, 0);

        assertEquals(0, result);
    }

    @Test
    public void testMultiplyValid() {
        //Test multiply two valid integers
        int result = calculator.multiply(5, 2);

        assertEquals(10, result);
    }

    @Test
    public void testMultiplyInvalid() {
        //Test multiply two invalid integers
        int result = calculator.multiply(-5, 2);

        assertEquals(0, result);
    }
}

