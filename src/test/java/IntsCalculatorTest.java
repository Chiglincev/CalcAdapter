import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntsCalculatorTest {
    IntsCalculator calculator;

    @BeforeEach
    public void newCalc() {
        calculator = new IntsCalculator();
    }

    @Test
    public void testSum() {
        int a = 5;
        int b = -8;
        int expected = -3;

        int result = calculator.sum(a, b);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMult() {
        int a = 4;
        int b = -3;
        int expected = -12;

        int result = calculator.mult(a, b);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPow() {
        int a = 3;
        int b = 7;
        int expected = 2187;

        int result = calculator.pow(a, b);

        Assertions.assertEquals(expected, result);
    }
}
