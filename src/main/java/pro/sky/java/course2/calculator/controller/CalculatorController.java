package pro.sky.java.course2.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.exception.DivisionByZeroException;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings (){
        return "<h3>Добро пожаловать в калькулятор.</h3>";
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(name = "num1", required = false) Integer x,
                           @RequestParam (name = "num2", required = false) Integer y){
        if(x == null || y ==null) {
            return "Не передано одно из значений";}
        int addition = calculatorService.addition(x, y);
        return x + " + " + y + " = " + addition;
    }
    @GetMapping("/minus")
    public String subtraction(@RequestParam(name = "num1", required = false) Integer x,
                              @RequestParam (name = "num2", required = false) Integer y){
        if(x == null || y ==null) {
            return "Не передано одно из значений";
        }
        int subtraction = calculatorService.subtraction(x, y);
        return x + " - " + y + " = " + subtraction;
    }
    @GetMapping("/multiply")
    public String multiplication(@RequestParam(name = "num1", required = false) Integer x,
                                 @RequestParam (name = "num2", required = false) Integer y){
        if(x == null || y ==null) {
            return "Не передано одно из значений";
        }
        int multiplication = calculatorService.multiplication(x, y);
        return x + " * " + y + " = " + multiplication;
    }
    @GetMapping("/divide")
    public String division(@RequestParam(name = "num1", required = false) Integer x,
                           @RequestParam (name = "num2", required = false) Integer y) throws IllegalAccessException {
        double division = calculatorService.division(x, y);
        return x + " / " + y + " = " + division;
    }
}