package com.thelis3k.worstcalcualtorever.controllers;

import com.thelis3k.worstcalcualtorever.services.CalculationHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HistoryController {

    private final CalculationHistoryService calculationHistoryService;

    @DeleteMapping("/history/clear")
    public String clear(@RequestParam(required = false, defaultValue = "false") boolean confirmation){
        return calculationHistoryService.clearHistory(confirmation);
    }

    @DeleteMapping("/history/deleteSpecific")
    public String deleteSpecific(@RequestParam double a, @RequestParam double b, @RequestParam String operation){
        return calculationHistoryService.deleteByParams(a, b, operation);
    }
}
