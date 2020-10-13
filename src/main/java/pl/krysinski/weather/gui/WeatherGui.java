package pl.krysinski.weather.gui;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.krysinski.weather.controller.WeatherController;


@Route("")
public class WeatherGui extends VerticalLayout {

    private WeatherController weatherController;

    @Autowired
    public void WeatherShowGui(WeatherController weatherController){

        TextField cityField = new TextField("City");



//        NumberField temperatureField = new NumberField("Temperature");
//        NumberField windSpeedField = new NumberField("Wind Speed");
//        NumberField pressureField = new NumberField("Pressure");
//        NumberField humidityField = new NumberField("Humidity");
//        NumberField cloudCoverField = new NumberField("Cloud cover");
//
        add(cityField);
//        add(temperatureField);
//        add(windSpeedField);
//        add(pressureField);
//        add(humidityField);
//        add(cloudCoverField);

        Button button = new Button("Search weather");

//        button.addClickListener(this::showButtonClickedMessage);
        add(button);

        Dialog dialog = new Dialog();


        dialog.setWidth("1000px");
        dialog.setHeight("300px");
        dialog.setResizable(true);


        button.addClickListener(event -> {
            Double temp = weatherController.getWeatherByCity(cityField.getValue()).getTemperature();
            Double windSpeed = weatherController.getWeatherByCity(cityField.getValue()).getWindSpeed();
            Integer pressure = weatherController.getWeatherByCity(cityField.getValue()).getPressure();
            Integer humidity = weatherController.getWeatherByCity(cityField.getValue()).getHumidity();
            Integer cloudCover = weatherController.getWeatherByCity(cityField.getValue()).getCloudcover();
            String iconWeather = weatherController.getWeatherByCity(cityField.getValue()).getWeatherIcon();


            Image i = new Image("img/"+ iconWeather + ".png", "");

            String cityName = cityField.getValue();
            Label city = new Label(cityName);

            Text text = new Text("Temperature = " + temp + " | Wind speed = " + windSpeed +
                    " | Pressure = " + pressure + " | Humidity = " + humidity + " | Cloud cover = " + cloudCover);
            VerticalLayout layout = new VerticalLayout();
            layout.setSpacing(true);
            layout.setAlignItems(Alignment.CENTER);
            layout.add(city, text, i);


            dialog.add(layout);

            dialog.open();
        });
    }

}
