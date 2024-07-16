package com.design.practice;

import com.design.e.practice.strategy.FastestPathStrategy;
import com.design.e.practice.strategy.NavigationStrategy;
import com.design.e.practice.strategy.ShortestPathStrategy;
import com.design.e.practice.strategy.StrategyContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class StrategyTest {
    StrategyContext strategyContext;
    NavigationStrategy fastestPathStrategy;
    NavigationStrategy shortestPathStrategy;

    @BeforeEach
    public void setup(){
        fastestPathStrategy = Mockito.mock(FastestPathStrategy.class);
        shortestPathStrategy = Mockito.mock(ShortestPathStrategy.class);
    }

    @Test
    public void testFast(){
        strategyContext = new StrategyContext(fastestPathStrategy);
        strategyContext.navigate("Dublin", "London");
        verify(fastestPathStrategy, times(1)).route("Dublin", "London");
    }
}
