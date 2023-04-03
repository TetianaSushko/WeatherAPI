package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastDay {
    private String date;
    private List<WeatherForecastByHours> hour;
    private WeatherForecastByDays day;
    private WeatherForecastAstro astro;

}
