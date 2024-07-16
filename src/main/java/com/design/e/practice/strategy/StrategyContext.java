package com.design.e.practice.strategy;

public class StrategyContext {
    private final NavigationStrategy navigationStrategy;

    public StrategyContext(NavigationStrategy navigationStrategy){
        this.navigationStrategy = navigationStrategy;
    }

    public void navigate(String source, String destination){
        navigationStrategy.route(source, destination);
    }
}
