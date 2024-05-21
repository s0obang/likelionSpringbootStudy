package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
//에러 여러개일떄 여러개를 띄워주기 위한 모델
@Getter
@AllArgsConstructor
public class ErrorResponse {
    private int errorcode;
    private List<String> errorMessages;
}
