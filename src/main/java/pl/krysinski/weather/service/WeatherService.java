package pl.krysinski.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.krysinski.weather.model.BasicInfoWeather;
import pl.krysinski.weather.model.openweatherApi.Weather;
import pl.krysinski.weather.model.openweatherApi.Weather_;

@Service
public class WeatherService {
    @Value("${weatherService.apiKey}")
    private String apiKey;

    public BasicInfoWeather getWeatherByCity(String city){
        RestTemplate restTemplate = new RestTemplate();
        Weather info = restTemplate.getForObject(String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s", city, apiKey), Weather.class);
        assert info != null;
        return new BasicInfoWeather(info.getName(), info.getMain().getTemp(), info.getWind().getSpeed(), info.getMain().getPressure(), info.getMain().getHumidity(), info.getClouds().getAll(), info.getWeather().stream().findAny().get().getIcon());
    }

//    public Weather_[](String city){
//        RestTemplate restTemplate = new RestTemplate();
//        Weather info = restTemplate.getForObject(String.format("http://httpapi.openweathermap.org/data/2.5/weather?q=%s&unitsnits=metric&appid=%s", city, apiKey), Weather.class);
//        Weather_[] test = restTemplate.getForObject(String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s", city, apiKey), Weather_[].class);
//        assert info != null;
//        return new BasicInfoWeather(info.getName(), info.getMain().getTemp(), info.getWind().getSpeed(), info.getMain().getPressure(), info.getMain().getHumidity(), info.getClouds().getAll());
//    }
}
