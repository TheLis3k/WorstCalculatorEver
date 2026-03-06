package com.thelis3k.worstcalcualtorever.dto;

import com.thelis3k.worstcalcualtorever.enums.OperationType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalculationDTO {
    private Integer id;
    private Double firstNumber;
    private Double secondNumber;
    private OperationType operation;
    private double result;
}
