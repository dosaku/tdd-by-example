package fibonacci;

import static fibonacci.Fibonacci.fib;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        int[][] cases = { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 } };
        for (int[] currentCase : cases) {
            int n = currentCase[0];
            int expected = currentCase[1];
            assertEquals(expected, fib(n));
        }
    }

}
