package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastByDays {
    @JsonProperty("maxtemp_c")
    private Double maxTempC;
    @JsonProperty("mintemp_c")
    private Double minTempC;
    @JsonProperty("avgtemp_c")
    private Double avgTempC;
    @JsonProperty("maxwind_kph")
    private Double maxWindKpH;
    @JsonProperty("totalprecip_mm")
    private Double totalPrecipMm;
    @JsonProperty("totalsnow_cm")
    private Double totalSnowCm;
    private Double avghumidity;
    @JsonProperty("daily_chance_of_rain")
    private Integer dailyChanceOfRain;
    @JsonProperty("daily_chance_of_snow")
    private Integer dailyChanceOfSnow;
    private Double uv;
}
