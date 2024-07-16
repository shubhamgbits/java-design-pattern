package com.design.c.structural.decorator;

public class DecoratorUsage {
    public static void execute(){
        MargheritaPizza pizza = new MargheritaPizza();

        ToppingExtraCheeze toppingExtraCheeze = new ToppingExtraCheeze(pizza);
        ToppingCoriander toppingCoriander = new ToppingCoriander(toppingExtraCheeze);

        System.out.println("Total Price: "+toppingCoriander.getPrice());
    }
}
