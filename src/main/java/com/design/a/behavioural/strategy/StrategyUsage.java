package com.design.a.behavioural.strategy;

public class StrategyUsage {
    public static void test(){
        NavigationStrategyContext context = new NavigationStrategyContext();

        // Set the strategy to FastestRouteStrategy
        context.setRouteStrategy(new FastestRouteStrategy());
        context.navigate("Point A", "Point B");

        // Change the strategy to ShortestRouteStrategy
        context.setRouteStrategy(new ShortestRouteStrategy());
        context.navigate("Point A", "Point B");
    }
}
