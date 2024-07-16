package com.design.e.practice.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FastestPathStrategy implements NavigationStrategy{

    @Override
    public void route(String source, String destination) {
        log.info("Navigating from the fastest route between {} and {}", source, destination);
    }
}
