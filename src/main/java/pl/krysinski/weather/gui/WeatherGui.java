package pl.krysinski.weather.gui;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.BigDecimalField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.krysinski.weather.controller.WeatherController;
import pl.krysinski.weather.model.BasicInfoWeather;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Route("weather")
public class WeatherGui extends VerticalLayout {

    private WeatherController weatherController;

    @Autowired
    public void WeatherInfoGui(WeatherController weatherController){
        this.weatherController =weatherController;

//        Grid<BasicInfoWeather> grid =  new Grid<>(BasicInfoWeather.class);
////        grid.setItems(weatherController.getWeatherByCity());
//        grid.addColumn(roundedTemp())
//        add(grid);


        BigDecimalField bigDecimalField = new BigDecimalField("Temp");
        bigDecimalField.addThemeVariants(TextFieldVariant.LUMO_ALIGN_RIGHT);
        BigDecimal temperature = roundedTemp();


        bigDecimalField.setValue(roundedTemp());

        add(bigDecimalField);
    }

    private  BigDecimal roundedTemp(){
        Double temp = weatherController.getWeatherByCity().getTemperature() -273.15;
        BigDecimal bd = new BigDecimal(temp);
        BigDecimal rounded = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return rounded;

    }
}
