package com.example.study.dto.calculator.request;

import lombok.Getter;

@Getter
public class CalculatorRequest {
    private final int number1;
    private final int number2;

    public CalculatorRequest(int number1, int number2){
        this.number1=number1;
        this.number2=number2;

    }
}
