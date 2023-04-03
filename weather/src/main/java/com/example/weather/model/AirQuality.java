package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AirQuality {
    private Double co;
    private Double no2;
    private Double o3;
    private Double so2;
    @JsonProperty("us-epa-index")
    private Integer UsEpaIndex;
}
