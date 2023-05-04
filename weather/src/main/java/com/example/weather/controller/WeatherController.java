package com.example.weather.controller;

import com.example.weather.model.WeatherResponse;
import com.example.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

  @GetMapping("/current")
    public WeatherResponse getCurrentWeather(@RequestParam String city){
        return weatherService.getWeatherResponse(city);
  }
  @GetMapping("/forecast")
    public WeatherResponse getForecastWeather(@RequestParam String city, @RequestParam Integer days){
        return weatherService.getForecast(city, days);
  }

  @GetMapping("air")
    public WeatherResponse getAirQuality(@RequestParam String city,@RequestParam String aqi){
        return weatherService.getAirQuality(city, aqi);
  }
}
