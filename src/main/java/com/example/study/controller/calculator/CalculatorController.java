package com.example.study.controller.calculator;

import com.example.study.dto.calculator.request.CalculatorMultiplyRequest;
import com.example.study.dto.calculator.request.CalculatorRequest;
import org.springframework.web.bind.annotation.*;
import com.example.study.CalcResult;

@RestController
public class CalculatorController {

    @GetMapping("/calc")
    @ResponseBody
    public CalcResult calcTwoNumbers(CalculatorRequest request) {
        return new CalcResult(
                request.getNumber1() + request.getNumber2(),
                request.getNumber1() - request.getNumber2(),
                request.getNumber1() * request.getNumber2(),
                request.getNumber1() / request.getNumber2()
        );
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }

}

