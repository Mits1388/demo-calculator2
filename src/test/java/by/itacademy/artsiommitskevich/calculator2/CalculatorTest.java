package by.itacademy.artsiommitskevich.calculator2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void sum1() {
       Calculator calculator = new Calculator();
        double actual = calculator.sum(1.3,2.3);
        Assertions.assertEquals(3.6, actual, 0.001d);
    }
    @Test
    public void minus1() {
        Calculator calculator = new Calculator();
        double actual = calculator.minus(1.3,2.3);
        Assertions.assertEquals(-1.0, actual, 0.001d);
    }
    @Test
    public void multiply1() {
        Calculator calculator = new Calculator();
        double actual = calculator.multiply(1.3,2.3);
        Assertions.assertEquals(2.99, actual, 0.001d);
    }
    @Test
    public void divide1() {
        Calculator calculator = new Calculator();
        double actual = calculator.divide(1.3,2.3);
        Assertions.assertEquals(0.565, actual, 0.001d);
    }
}
