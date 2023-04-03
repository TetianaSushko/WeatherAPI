package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherLocation {

    private String name;
    private String region;
    private String country;
    @JsonProperty("tz_id")
    private String tzId;
    private String localtime;

}
