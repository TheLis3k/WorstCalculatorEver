package com.thelis3k.worstcalcualtorever.services;

import com.thelis3k.worstcalcualtorever.interfaces.MathOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CalculatorService {
    private final Map<String, MathOperation> operations;

    public double calculate(double a, double b, String operator){
        if(operator == null || !(operations.containsKey(operator))){
            throw new IllegalArgumentException("What the fuck is: " + operator);
        }
        MathOperation operation = operations.get(operator);

        return operation.execute(a, b);
    }
}
