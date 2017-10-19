package Zad2.db;

import Zad2.Model.WeatherInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    private WeatherApi weatherApi = new WeatherApi();
    private List<WeatherInfo> forecast = new ArrayList<>();
    private int i = 0;

/*    public List<WeatherInfo> getForecast() {
        return forecast;
    }*/

    public WeatherInfo getForecastsForCities(List<String> cities, int i) throws IOException {
        String city = cities.get(i);
        int temp = weatherApi.getTemperature(cities.get(i));
        String description = weatherApi.getDescription(cities.get(i));
        return new WeatherInfo(city, description, temp);
    }

    public List<WeatherInfo> addForecasts(WeatherInfo weatherInfo, List<String> cities) {
/*        forecast.add(weatherInfo);*/

        for (int i=0; i < cities.size(); i++) {
            {
                try {
                    forecast.add(getForecastsForCities(cities,i));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return forecast;
    }
}

/*package Zad2.db;

        import Zad2.Model.WeatherInfo;
        import Zad2.io.WeatherFileManager;

        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;

public class WeatherData {

    private WeatherInfo cityforecast = new WeatherInfo();
    private List<WeatherInfo> forecast = new ArrayList<>();

    public List<WeatherInfo> getForecast() {
        return forecast;
    }

    private WeatherFileManager fileReader = new WeatherFileManager();
    private List<String> cities = fileReader.getCitiesFromFile();

    private WeatherApi weatherApi = new WeatherApi();
    int i = 0;

    public WeatherInfo getForecasts(int i) throws IOException {
        String city = cities.get(i);
        int temp = weatherApi.getTemperature(cities.get(i));
        String description = weatherApi.getDescription(cities.get(i));
        return new WeatherInfo(city,description,temp);
    }


    public void addForecast(WeatherInfo weatherInfo) {
        forecast.add(weatherInfo);
    }

    public void loop() {

        for (i = 0; i < cities.size(); i++) {
            try {
                addForecast(getForecasts(i));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}*/
