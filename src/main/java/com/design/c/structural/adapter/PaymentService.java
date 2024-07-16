package com.design.c.structural.adapter;

import com.design.c.structural.adapter.config.PaymentAdapter;
import com.design.c.structural.adapter.response.PaymentResponse;
import com.design.c.structural.adapter.response.UPIResponse;
import com.design.c.structural.adapter.response.VisaResponse;

import java.util.UUID;

public class PaymentService {
    public PaymentResponse pay(String mode, String amt){

        PaymentResponse paymentResponse = null;

//        if(mode.equalsIgnoreCase("upi")){
//            UPIResponse upiResponse = payWithUPI(amt);
//            paymentResponse = PaymentAdapter.convert(upiResponse);
//        }
//
//        if(mode.equalsIgnoreCase("visa")){
//            VisaResponse visaResponse = payWithVisa(amt);
//            paymentResponse = PaymentAdapter.convert(visaResponse);
//        }

        return paymentResponse;
    }

    private UPIResponse payWithUPI(String amount){
        UPIResponse upiResponse = new UPIResponse();
        upiResponse.setAmt(amount);
        upiResponse.setStatus("PAID");
        upiResponse.setTrnId(UUID.randomUUID().toString());
        return upiResponse;
    }

    private VisaResponse payWithVisa(String amount){
        VisaResponse visaResponse = new VisaResponse();
        visaResponse.setAmount(amount);
        visaResponse.setId(UUID.randomUUID().toString());
        visaResponse.setPayment_status("PAID");
        return visaResponse;
    }
}
