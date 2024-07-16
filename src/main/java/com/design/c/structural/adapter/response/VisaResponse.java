package com.design.c.structural.adapter.response;

import lombok.Data;

@Data
public class VisaResponse {
    private String payment_status;
    private String id;
    private String amount;
}
