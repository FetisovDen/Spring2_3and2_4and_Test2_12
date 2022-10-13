package pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Calculator2_3;

import org.springframework.stereotype.Service;

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
    public double divide(int num1, int num2)  {
        double result = (double)num1 / num2;
        return  result;
    }
}
