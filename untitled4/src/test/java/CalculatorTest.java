package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }
    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        assertEquals(6, result, "2 * 3 should equal 6");
    }
    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(6, 2);
        assertEquals(3, result, "6 / 2 should equal 3");
    }
}