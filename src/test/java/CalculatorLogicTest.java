import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorLogicTest {
    CalculatorLogic calc = new CalculatorLogic();

    @Test
    public void testAddition() {
        assertEquals(5.0, calc.add(2, 3));
        assertEquals(-1.0, calc.add(-2, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, calc.subtract(2, 3));
        assertEquals(-3.0, calc.subtract(-2, 1));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calc.multiply(2, 3));
        assertEquals(-2.0, calc.multiply(-2, 1));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.divide(6, 3));
        assertEquals(-2.0, calc.divide(-6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }
}
