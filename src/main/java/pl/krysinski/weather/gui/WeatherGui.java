package pl.krysinski.weather.gui;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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
        Button button = new Button("Search weather");
        Dialog dialog = new Dialog();
        VerticalLayout layout = new VerticalLayout();

        dialog.setWidth("1000px");
        dialog.setHeight("300px");
        dialog.setResizable(true);

        layout.setSpacing(true);
        layout.setAlignItems(Alignment.CENTER);

        add(cityField);
        add(button);


        button.addClickListener(event -> {
            String cityName = cityField.getValue();
            Double temp = weatherController.getWeatherByCity(cityField.getValue()).getTemperature();
            Double windSpeed = weatherController.getWeatherByCity(cityField.getValue()).getWindSpeed();
            Integer pressure = weatherController.getWeatherByCity(cityField.getValue()).getPressure();
            Integer humidity = weatherController.getWeatherByCity(cityField.getValue()).getHumidity();
            Integer cloudCover = weatherController.getWeatherByCity(cityField.getValue()).getCloudcover();
            String iconWeather = weatherController.getWeatherByCity(cityField.getValue()).getWeatherIcon();

            Label city = new Label(cityName);
            Text text = new Text("Temperature = " + temp + " | Wind speed = " + windSpeed +
                    " | Pressure = " + pressure + " | Humidity = " + humidity + " | Cloud cover = " + cloudCover);
            Image i = new Image("img/"+ iconWeather + ".png", "");

            layout.add(city, text, i);

            dialog.add(layout);
            dialog.open();
        });

    }

}
