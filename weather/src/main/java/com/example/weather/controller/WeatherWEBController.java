package com.example.weather.controller;

import com.example.weather.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weather")
public class WeatherWEBController {
    private WeatherService weatherService;

    public WeatherWEBController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/web")
    public String weather( Model model){
        model.addAttribute("date", "07/04/2023");
        model.addAttribute("city", "Odesa");
        model.addAttribute("temp", "+10°");
        model.addAttribute("feelsLike", "+9°");
        return "weather";
    }
}