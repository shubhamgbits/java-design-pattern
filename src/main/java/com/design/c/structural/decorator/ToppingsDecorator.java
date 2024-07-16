package com.design.c.structural.decorator;

public class ToppingsDecorator extends BasePizza{
    protected BasePizza basePizza;

    public ToppingsDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public double getPrice(){
        return this.basePizza.getPrice() + this.myPrice;
    }
}
