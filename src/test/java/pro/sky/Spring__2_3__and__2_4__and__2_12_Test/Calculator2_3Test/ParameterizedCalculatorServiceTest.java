package pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3.CalculatorService;
import pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3.Exception.NoZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedCalculatorServiceTest {
    private CalculatorService calculatorService;
    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }
    @ParameterizedTest
    @CsvSource({"2,3","1,5","11,5"} )
    public void PlusTest(int num1, int num2) {
        int ForTest = calculatorService.plus(num1, num2);
        int Check = num1 + num2;
        assertEquals(ForTest, Check);
    }
    @ParameterizedTest
    @CsvSource({"2,3","1,5","11,5"} )
    public void minusTest(int num1, int num2) {
        int ForTest = calculatorService.minus(num1, num2);
        int Check = num1 - num2;
        assertEquals(ForTest, Check);
    }
    @ParameterizedTest
    @CsvSource({"2,3","1,5","11,5"} )
    public void multiplyTest(int num1, int num2) {
        int ForTest = calculatorService.multiply(num1, num2);
        int Check = num1 * num2;
        assertEquals(ForTest, Check);
    }
    @ParameterizedTest
    @CsvSource({"2,3","1,5","11,5"} )
    public void divideTest(int num1, int num2) throws NoZeroException {
        int ForTest = (int) calculatorService.divide(num1, num2);
        int Check = num1 / num2;
        assertEquals(ForTest, Check);
    }


}
