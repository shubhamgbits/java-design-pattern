package com.design.c.structural.decorator;

public class ToppingExtraCheeze extends ToppingsDecorator{
    public ToppingExtraCheeze(BasePizza basePizza) {
        super(basePizza);
        this.myPrice = 20;
    }
}
