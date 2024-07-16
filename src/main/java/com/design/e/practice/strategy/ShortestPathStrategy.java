package com.design.e.practice.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShortestPathStrategy implements NavigationStrategy{

    @Override
    public void route(String source, String destination) {
        log.info("Navigating through shortest path between {} to {}", source, destination);
    }
}
