package com.example.weather.model;

import lombok.Data;

@Data
public class WeatherResponse {

    private WeatherLocation location;
    private WeatherCurrent current;
    private WeatherForecast forecast;
}
