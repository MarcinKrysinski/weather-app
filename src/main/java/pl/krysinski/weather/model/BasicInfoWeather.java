package pl.krysinski.weather.model;

import java.util.List;

public class BasicInfoWeather {

    private String city;
    private Double temperature;
    //    private List<String> weatherIcons = null;
    private Double windSpeed;
    private Integer pressure;
    private Integer humidity;
    private Integer cloudcover;

    public BasicInfoWeather(String city, Double temperature, Double windSpeed, Integer pressure, Integer humidity, Integer cloudcover) {
        this.city = city;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
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
        this.temperature = temperature - 273.15;
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

    //    public BasicInfoWeather(BasicInfoWeatherBuilder basicWeatherInfoBuilder){
//        this.city = basicWeatherInfoBuilder.city;
//        this.temperature = basicWeatherInfoBuilder.temperature;
////        this.weatherIcons = basicWeatherInfoBuilder.weatherIcons;
//        this.windSpeed = basicWeatherInfoBuilder.windSpeed;
//        this.pressure = basicWeatherInfoBuilder.pressure;
//        this.humidity = basicWeatherInfoBuilder.humidity;
//        this.cloudcover = basicWeatherInfoBuilder.cloudcover;
//    }


//    public static class BasicInfoWeatherBuilder {
//        private String city;
//        private Double temperature;
//        private List<String> weatherIcons = null;
//        private Double windSpeed;
//        private Integer pressure;
//        private Integer humidity;
//        private Integer cloudcover;
//
//        public BasicInfoWeatherBuilder buildCity(String city) {
//            this.city = city;
//            return this;
//        }
//
//        public BasicInfoWeatherBuilder buildTemperature(Double temperature) {
//            this.temperature = temperature;
//            return this;
//        }
//
////        public BasicInfoWeatherBuilder buildWeatherIcons(List<String> weatherIcons) {
////            this.weatherIcons = weatherIcons;
////            return this;
////        }
//
//        public BasicInfoWeatherBuilder buildWindSpeed(Double windSpeed) {
//            this.windSpeed = windSpeed;
//            return this;
//        }
//
//
//        public BasicInfoWeatherBuilder buildPressure(Integer pressure) {
//            this.pressure = pressure;
//            return this;
//        }
//        public BasicInfoWeatherBuilder buildHumidity(Integer humidity){
//            this.humidity = humidity;
//            return this;
//        }
//        public BasicInfoWeatherBuilder buildCloudcover(Integer cloudcover){
//            this.cloudcover = cloudcover;
//            return this;
//        }
//
////
////        public BasicInfoWeather buildBasicInfoWeather() {
////            return new BasicInfoWeather(this);
////
////        }

    @Override
    public String toString() {
        return "BasicInfoWeatherBuilder{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", cloudcover=" + cloudcover +
                '}';
    }
}
//}
