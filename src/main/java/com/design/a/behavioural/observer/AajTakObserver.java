package com.design.a.behavioural.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AajTakObserver implements WeatherObserver{
    @Override
    public void update(WeatherType type) {
        log.info("Weather reporting from Aajtak: {}", type.toString());
    }
}
