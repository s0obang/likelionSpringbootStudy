package com.example.study;

import lombok.Getter;

@Getter
public class CalcResult {
    private final int add;
    private final int minus;
    private final int multiply;
    private final int division;

    public CalcResult(
            int add, int minus,
            int multiply, int division
    ){
        this.add=add;
        this.minus=minus;
        this.multiply=multiply;
        this.division=division;
    }

}
