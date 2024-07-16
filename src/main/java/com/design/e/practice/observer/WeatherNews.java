package com.design.e.practice.observer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
public class WeatherNews {
    private String city;
    private String weather;
    private List<NewsObserver> observerList;

    public WeatherNews(String city, String weather){
        this.city = city;
        this.weather = weather;
        observerList = new ArrayList<>();
    }

    public void addObserver(NewsObserver newsObserver){
        this.observerList.add(newsObserver);
    }

    public void removeObserver(NewsObserver newsObserver){
        this.observerList.remove(newsObserver);
    }

    public void weatherUpdate(String newWeather){
        String news = String.format("Weather of %s has changed from %s to %s", city, weather, newWeather);
        this.weather = newWeather;
        notifyAll(news);
    }

    public void notifyAll(String news){
        observerList.forEach(observer -> observer.report(news));
    }
}
