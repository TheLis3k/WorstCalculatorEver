package com.thelis3k.worstcalcualtorever.services;

import com.thelis3k.worstcalcualtorever.entities.Calculation;
import com.thelis3k.worstcalcualtorever.enums.OperationType;
import com.thelis3k.worstcalcualtorever.repositories.CalculationRepository;
import jakarta.transaction.Transactional;
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

    public String clearHistory(boolean confirmation){
        if (confirmation) {
            calculationRepository.deleteAll();
            return "Success";
        }
        return "Failure";
    }

    @Transactional
    public String deleteByParams(Double firstNumber, Double secondNumber, String operator){
        OperationType operationType;
        try{
            operationType = OperationType.valueOf(operator.toLowerCase());
        } catch (IllegalArgumentException | NullPointerException e){
            throw new IllegalArgumentException("What the fuck is: " + operator);
        }

        if(!calculationRepository.existsByFirstNumberAndSecondNumberAndOperation(
                firstNumber, secondNumber, operationType)){
            return "Not found lol";
        }
        calculationRepository.deleteByFirstNumberAndSecondNumberAndOperation(
                firstNumber, secondNumber, operationType);
        return "Deleted";
    }



}
