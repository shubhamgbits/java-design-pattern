package com.design.practice;

import com.design.c.structural.adapter.response.PaymentResponse;
import com.design.c.structural.adapter.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.assertArg;
import static org.mockito.Mockito.verify;

public class AdapterTest {
    private PaymentService paymentService;

    @BeforeEach
    public void setup(){
        paymentService = new PaymentService();
    }

    @Test
    public void testPayment(){
        PaymentResponse paymentResponse = paymentService.pay("upi","50");

        assertEquals(paymentResponse.getMode(), "UPI");
        assertEquals(paymentResponse.getAmount(), "50");
        assertEquals(paymentResponse.getStatus(), "PAID");
    }
}
