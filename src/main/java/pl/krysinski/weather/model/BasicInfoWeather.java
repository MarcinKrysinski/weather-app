package pl.krysinski.weather.model;

import pl.krysinski.weather.model.openweatherApi.Weather_;

import java.util.List;

public class BasicInfoWeather {

    private String city;
    private Double temperature;
    private Double windSpeed;
    private Integer pressure;
    private Integer humidity;
    private Integer cloudcover;
    private String weatherIcon;

    public BasicInfoWeather(String city, Double temperature, Double windSpeed, Integer pressure, Integer humidity, Integer cloudcover, String weatherIcon) {
        this.city = city;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
        this.weatherIcon = weatherIcon;
//        this.weatherIcons = weatherIcons;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

//    public String getWeatherIcons() {
//        return weatherIcons;
//    }
//
//    public void setWeatherIcons(String weatherIcons) {
//        this.weatherIcons = weatherIcons;
//    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    @Override
    public String toString() {
        return "BasicInfoWeather{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", cloudcover=" + cloudcover +
                ", weatherIcons='" + weatherIcon + '\'' +
                '}';
    }
}

