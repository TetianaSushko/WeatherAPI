package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastByHours {
    private String time;
    @JsonProperty("temp_c")
    private Double tempC;
    private Integer cloud;
    @JsonProperty("feelslike_c")
    private Double feelslikeC;
    @JsonProperty("chance_of_rain")
    private Integer chanceOfRain;
    @JsonProperty("chance_of_snow")
    private Integer chanceOfSnow;
    private Double uv;
}
