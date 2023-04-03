package com.example.weather.service;


import com.example.weather.model.WeatherResponse;

public interface WeatherService {
    WeatherResponse getWeatherResponse(String city);
    WeatherResponse getForecast(String city, Integer days);
    WeatherResponse getAirQuality(String city,String aqi);
}
