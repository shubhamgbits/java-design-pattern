package com.design.c.structural.adapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdapterConfig {

    @Bean
    public PaymentAdapter upiAdapter() {
        return new UPIAdapter();
    }

    @Bean
    public PaymentAdapter visaAdapter() {
        return new VisaAdapter();
    }
}
