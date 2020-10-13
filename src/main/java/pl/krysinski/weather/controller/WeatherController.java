package pl.krysinski.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.krysinski.weather.model.BasicInfoWeather;
import pl.krysinski.weather.service.WeatherService;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class WeatherController {
    
    WeatherService weatherService;
    
    @Autowired
    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }


//    public void getWeatherByCity(String city){
//        log.info(weatherService.getWeatherByCity(city));
//    }


//    @CrossOrigin(origins = "http://localhost:8080")
//    public BasicInfoWeather getWeatherByCity(){
//        BasicInfoWeather testt = weatherService.getWeatherByCity("London");
//        return testt;
//    }

    @CrossOrigin(origins = "http://localhost:8080")
    public BasicInfoWeather getWeatherByCity(String cityName){
        return weatherService.getWeatherByCity(cityName);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get(){
        getWeatherByCity("London");
        BasicInfoWeather object = getWeatherByCity("London");
        System.out.println(object);

    }
    
   
}
