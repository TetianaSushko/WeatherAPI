package com.example.weather.service;

import com.example.weather.model.WeatherCurrent;
import com.example.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class WeatherServiceImpl implements WeatherService{

    private final RestTemplate restTemplate;
    public WeatherServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    @Value("${keyApi}")
    private String keyApi;

    @Value("${basicURL}")
    private String basicURL;

    @Override
    public WeatherResponse getWeatherResponse(String city) {

        String url = basicURL + "current.json?key=" + keyApi + "&q=" + city;

            WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
        //різні варіанти, з маперром правильно, бо при зміні
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            WeatherResponse weatherResponse = mapper.readValue(result, WeatherResponse.class);
//            System.out.println(weatherResponse);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(response);
        return response;
    }
    @Override
    public WeatherResponse getForecast(String city, Integer days) {
        String url = basicURL + "forecast.json?key=" + keyApi + "&q=" + city + "&days=" + days;
        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
        System.out.println(response);
        return response;
    }

    @Override
    public WeatherResponse getAirQuality(String city, String aqi) {
        String url = basicURL + "current.json?key=" + keyApi + "&q=" + city + "&aqi=" + aqi;
        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
        System.out.println(response);
        if (response.getCurrent().getAirQuality().getUsEpaIndex() == 1) {
            System.out.println("It's good air quality");
        } else if (response.getCurrent().getAirQuality().getUsEpaIndex() <= 4) {
            System.out.println("It's not good air quality for people with lungs problems");
        } else {
            System.out.println("It's very dangerously for your health. Close all windows and drink more water");
        }
        return response;
    }
}

