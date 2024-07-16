package com.design.c.structural.adapter.config;

import com.design.c.structural.adapter.response.PaymentResponse;

public interface PaymentAdapter {
    PaymentResponse convert(Object response);
}
