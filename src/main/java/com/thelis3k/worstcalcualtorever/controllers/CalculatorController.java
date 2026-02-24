package com.thelis3k.worstcalcualtorever.controllers;


import com.thelis3k.worstcalcualtorever.services.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/calculator/{operator}")
    public double calculate(@RequestParam double a, @RequestParam double b, @PathVariable String operator){
        return calculatorService.calculate(a, b, operator);
    }
}
