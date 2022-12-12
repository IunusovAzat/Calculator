package pro.sky.java.course2.calculator.service;

public interface CalculatorService {
    public int addition(Integer x, Integer y);
    public int subtraction(Integer x, Integer y);
    public int multiplication(Integer x, Integer y);
    public double division(Integer x, Integer y) throws IllegalAccessException;
}