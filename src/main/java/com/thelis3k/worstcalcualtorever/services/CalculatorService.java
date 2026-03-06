package com.thelis3k.worstcalcualtorever.services;

import com.thelis3k.worstcalcualtorever.enums.OperationType;
import com.thelis3k.worstcalcualtorever.interfaces.MathOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CalculatorService {
    private final CalculationHistoryService historyService;
    private final Map<String, MathOperation> operations;

    public double calculate(double a, double b, String operator){
        OperationType operationType;

        try{
            operationType = OperationType.valueOf(operator.toLowerCase());
        } catch (IllegalArgumentException | NullPointerException e){
            throw new IllegalArgumentException("What the fuck is: " + operator);
        }

        MathOperation operation = operations.get(operationType.name());

        if(operation == null){
            throw new IllegalStateException("Not implemented yet: " + operationType);
        }

        double result = operation.execute(a, b);

        historyService.saveHistory(a, b, operationType, result);

        return result;
    }
}
