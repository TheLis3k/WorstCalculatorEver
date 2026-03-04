package com.thelis3k.worstcalcualtorever.components;

import com.thelis3k.worstcalcualtorever.interfaces.MathOperation;
import org.springframework.stereotype.Component;

@Component
public class Div implements MathOperation {
    @Override
    public double execute(double a, double b) {
        double result;
        try {
            result = a / b;
        } catch (Exception e) {
            return 0;
        }
        return result;
    }
}
