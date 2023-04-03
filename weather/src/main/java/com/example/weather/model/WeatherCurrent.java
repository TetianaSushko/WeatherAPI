package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherCurrent {
    @JsonProperty("air_quality")
    private AirQuality airQuality;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("temp_c")
    private Double tempC;
    @JsonProperty("is_day")
    private Integer isDay;
    @JsonProperty("wind_kph")
    private Double windKph;
    @JsonProperty("wind_dir")
    private String windDir;
    private Integer cloud;
    @JsonProperty("feelslike_c")
    private Double feelsLikeC;
    private Double uv;
    @JsonProperty("precip_mm")
    private Double precipMm;

}
