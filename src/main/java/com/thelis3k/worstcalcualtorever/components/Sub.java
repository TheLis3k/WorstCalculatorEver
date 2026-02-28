package com.thelis3k.worstcalcualtorever.components;

import com.thelis3k.worstcalcualtorever.interfaces.MathOperation;
import org.springframework.stereotype.Component;

@Component("sub")
public class Sub implements MathOperation {
    @Override
    public double execute(double a, double b) {
        double range;
        try {
            range = (a - b + 1);
        } catch (Exception e) {
            range = 1;
        }

        return (int) ((Math.random() * range));
    }
}