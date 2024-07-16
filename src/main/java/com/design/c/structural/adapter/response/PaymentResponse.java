package com.design.c.structural.adapter.response;

import lombok.Data;

@Data
public class PaymentResponse {
    private String transactionId;
    private String status;
    private String mode;
    private String amount;
}
