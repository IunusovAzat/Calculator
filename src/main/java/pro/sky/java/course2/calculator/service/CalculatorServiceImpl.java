package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exception.DivisionByZeroException;

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
        if(x == null || y ==null){
            throw new DivisionByZeroException();
        }
        return (double)x / y;
    }
}
