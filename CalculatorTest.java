import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, Calculator.subtract(6, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, Calculator.multiply(4, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, Calculator.divide(5, 2), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(5, 0);
    }
}
//some cxomments here to be documetns
