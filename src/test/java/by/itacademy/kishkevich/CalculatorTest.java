package by.itacademy.kishkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSumInt() {
        Calculator calc = new Calculator();
        int actualResult = calc.sum(1, 2);
        int expectedResult = 3;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumString() {
        Calculator calc = new Calculator();
        String actualResult = calc.sum("6", "0");
        String expectedResult = "6";
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubtractInt() {
        Calculator calc = new Calculator();
        int actualResult = calc.subtract(6, 2);
        int expectedResult = 4;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubtractString() {
        Calculator calc = new Calculator();
        String actualResult = calc.subtract("6", "10");
        String expectedResult = "-4";
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
