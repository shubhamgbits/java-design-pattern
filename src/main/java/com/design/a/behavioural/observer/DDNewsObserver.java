package com.design.a.behavioural.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DDNewsObserver implements WeatherObserver{

    @Override
    public void update(WeatherType type) {
        log.info("Weather reporting from DD News: {}", type.toString());
    }
}
