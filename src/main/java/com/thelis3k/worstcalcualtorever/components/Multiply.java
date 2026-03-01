package com.thelis3k.worstcalcualtorever.components;

import com.thelis3k.worstcalcualtorever.interfaces.MathOperation;
import org.springframework.stereotype.Component;

@Component("multipy")
public class Multiply implements MathOperation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
