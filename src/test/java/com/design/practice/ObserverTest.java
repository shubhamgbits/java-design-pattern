package com.design.practice;

import com.design.e.practice.observer.NewsObserver;
import com.design.e.practice.observer.WeatherNews;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class ObserverTest {
    private WeatherNews udaipurNews;
    private NewsObserver ddNewsObserver;
    private NewsObserver aajTakObserver;

    @BeforeEach
    public void setup(){
        udaipurNews = new WeatherNews("Udaipur", "Sunny");
        ddNewsObserver = Mockito.mock(NewsObserver.class);
        aajTakObserver = Mockito.mock(NewsObserver.class);
    }

    @Test
    public void testAddObserver() {
        udaipurNews.addObserver(ddNewsObserver);
        udaipurNews.addObserver(aajTakObserver);
        udaipurNews.weatherUpdate("Rainy");

        verify(ddNewsObserver, times(1)).report("Weather of Udaipur has changed from Sunny to Rainy");
        verify(aajTakObserver, times(1)).report("Weather of Udaipur has changed from Sunny to Rainy");
    }

    @Test
    public void testRemoveObserver(){
        udaipurNews.addObserver(ddNewsObserver);
        udaipurNews.addObserver(aajTakObserver);
        udaipurNews.removeObserver(ddNewsObserver);
        udaipurNews.weatherUpdate("Rainy");

        verify(ddNewsObserver, never()).report("Weather of Udaipur has changed from Sunny to Rainy");
        verify(aajTakObserver, times(1)).report("Weather of Udaipur has changed from Sunny to Rainy");
    }
}
