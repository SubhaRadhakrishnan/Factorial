import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnFactorial1IfNumberIs0() {
        Factorial factorial = new Factorial();
        int factorialResult = factorial.getFactorial(0);
        assertEquals(factorialResult,1);
    }
    @Test
    void shouldReturnFactorial1IfNumberIs1() {
        Factorial factorial = new Factorial();
        int factorialResult = factorial.getFactorial(1);
        assertEquals(factorialResult,1);
    }
    @Test
    void shouldReturnFactorialForPositiveNumber() {
        Factorial factorial = new Factorial();
        int factorialResult = factorial.getFactorial(5);
        assertEquals(factorialResult,120);
    }
}
