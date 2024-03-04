import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(4.0, Calculator.add(2.0, 2.0), 0);
        assertEquals(-1.0, Calculator.add(2.0, -3.0), 0);
        assertEquals(0.0, Calculator.add(0.0, 0.0), 0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, Calculator.subtract(5, 2), 0);
        assertEquals(0, Calculator.subtract(5, 5), 0);
        assertEquals(-5, Calculator.subtract(0, 5), 0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Calculator.multiply(2, 3), 0);
        assertEquals(0, Calculator.multiply(5, 0), 0);
        assertEquals(-8, Calculator.multiply(2, -4), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.divide(6, 3), 0);
        assertEquals(0, Calculator.divide(0, 5), 0);
        assertEquals(-2, Calculator.divide(10, -5), 0);
    }

    @Test
    public void testPower() {
        assertEquals(8, Calculator.pow(2, 3), 0);
        assertEquals(1, Calculator.pow(5, 0), 0);
        assertEquals(0, Calculator.pow(0, 10), 0);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2, Calculator.sqrt(4), 0);
        assertEquals(0, Calculator.sqrt(0), 0);
        assertEquals(3, Calculator.sqrt(9), 0);
    }

    @Test
    public void testFactorial() {
        assertEquals(24, Calculator.factorial(4), 0);
        assertEquals(1, Calculator.factorial(0), 0);
        assertEquals(1, Calculator.factorial(1), 0);
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(4.605, Calculator.log(100), 0.001); // ln(100) is approximately 4.605
        assertEquals(1, Calculator.log(Math.E), 0); // ln(e) is 1
        assertEquals(Double.NaN, Calculator.log(-5), 0); // Negative input
    }
}

