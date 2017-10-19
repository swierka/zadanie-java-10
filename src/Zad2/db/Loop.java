/*
package Zad2.db;

import Zad2.Model.WeatherInfo;
import org.w3c.dom.ls.LSInput;

import java.io.IOException;
import java.util.List;

public class Loop {


    public void loop(List<String> cities) {

        WeatherData weatherData = new WeatherData();
        weatherData.getForecast();

        int i = 0;
        for (i = 0; i < cities.size(); i++) {
            try {
                weatherData.addForecast(weatherData.getForecast(i));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
*/
