package com.design.c.structural.adapter.config;

import com.design.c.structural.adapter.config.PaymentAdapter;
import com.design.c.structural.adapter.response.PaymentResponse;
import com.design.c.structural.adapter.response.VisaResponse;

public class VisaAdapter implements PaymentAdapter {

    @Override
    public PaymentResponse convert(Object object) {
        VisaResponse response = (VisaResponse) object;
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setMode("Card");
        paymentResponse.setStatus(response.getPayment_status());
        paymentResponse.setAmount(response.getAmount());
        paymentResponse.setTransactionId(response.getId());

        return paymentResponse;
    }
}
