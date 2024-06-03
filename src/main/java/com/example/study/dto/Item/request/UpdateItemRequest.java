package com.example.study.dto.Item.request;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;

@Getter
public class UpdateItemRequest {

    private String description;
    private long startingPrice;

    public UpdateItemRequest(String description, long startingPrice){
        this.description=description;
        this.startingPrice=startingPrice;
    }
}
