package com.design.c.structural.adapter.config;

import com.design.c.structural.adapter.config.PaymentAdapter;
import com.design.c.structural.adapter.response.PaymentResponse;
import com.design.c.structural.adapter.response.UPIResponse;

public class UPIAdapter implements PaymentAdapter {

    @Override
    public PaymentResponse convert(Object object) {
        UPIResponse response = (UPIResponse) object;
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setMode("UPI");
        paymentResponse.setStatus(response.getStatus());
        paymentResponse.setAmount(response.getAmt());
        paymentResponse.setTransactionId(response.getTrnId());

        return paymentResponse;
    }
}
