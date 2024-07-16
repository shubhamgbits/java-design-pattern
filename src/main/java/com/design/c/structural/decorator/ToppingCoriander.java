package com.design.c.structural.decorator;

public class ToppingCoriander extends ToppingsDecorator{
    public ToppingCoriander(BasePizza basePizza) {
        super(basePizza);
        this.myPrice = 5;
    }
}
