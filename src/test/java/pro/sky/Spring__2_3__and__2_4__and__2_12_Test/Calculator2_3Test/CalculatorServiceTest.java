package pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3Test;

import org.apache.el.parser.AstTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3.CalculatorService;
import pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3.Exception.NoZeroException;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    int num1_1 = 11;
    int num1_2 = 10;
    int num2_1 = 52;
    int num2_2 = 63;
    private CalculatorService calculatorService;


    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    public void plusTest(int num1, int num2) {
        int ForTest = calculatorService.plus(num1, num2);
        int Check = num1 + num2;
        assertEquals(ForTest, Check);
    }

    public void minusTest(int num1, int num2) {
        int ForTest = calculatorService.minus(num1, num2);
        int Check = num1 - num2;
        assertEquals(ForTest, Check);
    }

    public void multiplyTest(int num1, int num2) {
        int ForTest = calculatorService.multiply(num1, num2);
        int Check = num1 * num2;
        assertEquals(ForTest, Check);
    }

    public void divideTest(int num1, int num2) throws NoZeroException {
        int ForTest = (int) calculatorService.divide(num1, num2);
        int Check = num1 / num2;
        assertEquals(ForTest, Check);
    }

    @Test
    public void TestPlus() {
        plusTest(num1_1, num1_2);
        plusTest(num2_1, num2_2);
    }

    @Test
    public void TestMinus() {
        minusTest(num1_1, num1_2);
        minusTest(num2_1, num2_2);
    }

    @Test
    public void TestMultiply() {
        multiplyTest(num1_1, num1_2);
        multiplyTest(num2_1, num2_2);
    }

    @Test
    public void TestDivide() throws NoZeroException {
        divideTest(num1_1, num1_2);
        divideTest(num2_1, num2_2);
    }

    @Test
    public void TestDivideOnNull()  {
        num1_2 = 0;
        assertThrows(NoZeroException.class, () -> {
            divideTest(num1_1, num1_2);
                }
        );

    }
}
