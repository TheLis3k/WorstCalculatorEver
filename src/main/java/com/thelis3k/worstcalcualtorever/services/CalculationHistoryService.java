package com.thelis3k.worstcalcualtorever.services;

import com.thelis3k.worstcalcualtorever.entities.Calculation;
import com.thelis3k.worstcalcualtorever.enums.OperationType;
import com.thelis3k.worstcalcualtorever.repositories.CalculationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculationHistoryService {
    private final CalculationRepository calculationRepository;

    public void saveHistory(double a, double b, OperationType operation, double result){
        Calculation calculation = Calculation.builder()
                .firstNumber(a)
                .secondNumber(b)
                .operation(operation)
                .result(result)
                .build();

        calculationRepository.save(calculation);
    }
}
