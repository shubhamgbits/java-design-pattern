package com.design.e.practice.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DDNewsObserver implements NewsObserver{
    @Override
    public void report(String news) {
        log.info("Reporting from DD News: {}", news);
    }
}
