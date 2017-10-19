package Zad2.App;

import Zad2.Model.WeatherInfo;
import Zad2.db.WeatherData;
import Zad2.io.WeatherFileManager;

import java.io.IOException;
import java.util.List;

public class WeatherPro {
    public static void main(String[] args) {

        WeatherFileManager fileManager = new WeatherFileManager();
        WeatherData weatherData = new WeatherData();

        WeatherInfo forecast = null;
        try {
            forecast = weatherData.getForecastsForCities(fileManager.getCitiesFromFile(),0);
        } catch (IOException e) {
            System.out.println("Nie mozna odnalezc wskazanego pliku");
        }
        List<WeatherInfo> list = weatherData.addForecasts(forecast,fileManager.getCitiesFromFile());
        fileManager.saveForecastsInAfile(list);
    }
}
