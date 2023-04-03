package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastAstro {
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;

}
