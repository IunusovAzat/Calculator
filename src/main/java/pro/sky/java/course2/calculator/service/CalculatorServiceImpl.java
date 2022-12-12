package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int addition(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public int subtraction(Integer x, Integer y) {
        return x - y;
    }

    @Override
    public int multiplication(Integer x, Integer y) {
        return x * y;
    }

    @Override
    public double division(Integer x, Integer y) throws IllegalAccessException {
        if(y==0) throw new IllegalAccessException("Неверное значение num2");
        return (double)x / y;
    }
}
