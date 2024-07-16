package com.design.c.structural.adapter.response;

import lombok.Data;

@Data
public class UPIResponse {
    private String status;
    private String trnId;
    private String amt;
}
