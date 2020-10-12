package pl.krysinski.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.krysinski.weather.model.BasicInfoWeather;
import pl.krysinski.weather.model.openweatherApi.Weather;

@Service
public class WeatherService {
//    @Value("${apiKey}")
    private String apiKey;

    public BasicInfoWeather getWeatherByCity(String city){
        RestTemplate restTemplate = new RestTemplate();
        Weather info = restTemplate.getForObject(String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&appid=5c84dd6b8dd331310606234f7f6a096f", city), Weather.class);
        assert info != null;
        BasicInfoWeather test = new BasicInfoWeather(info.getName(), info.getMain().getTemp(), info.getWind().getSpeed(), info.getMain().getPressure(), info.getMain().getHumidity(), info.getClouds().getAll());
        return test;
    }
}
