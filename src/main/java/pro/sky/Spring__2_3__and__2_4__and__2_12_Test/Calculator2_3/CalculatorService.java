package pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3;

import org.springframework.stereotype.Service;
import pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3.Exception.NoZeroException;
@Service
public class CalculatorService {

    public int plus(int num1, int num2){
        int result = num1 + num2;
        return  result;
    }
    public int minus(int num1, int num2){
        int result = num1 - num2;
        return  result;
    }
    public int multiply(int num1, int num2){
        int result = num1 * num2;
        return  result;
    }
    public double divide(int num1, int num2) throws NoZeroException {
        if (num2== 0) {
            throw new NoZeroException("На ноль делить нельзя");
        }
        double result = (double)num1 / num2;
        return  result;
    }
}
