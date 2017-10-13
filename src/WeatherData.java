import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    public List getForecast() {


        List<WeatherInfo> forecast = new ArrayList<>();
        WeatherInfo cityforecast = new WeatherInfo();

        WeatherFileManager fileReader = new WeatherFileManager();
        List cities = fileReader.getCitiesFromFile();
        WeatherApi weatherApi = new WeatherApi();



        for (int i = 0; i < cities.size(); i++) {
            try {
                cityforecast.setCity((String) cities.get(i));
                cityforecast.setTemperature(weatherApi.getTemperature((String) cities.get(i)));
                cityforecast.setDescription(weatherApi.getDescription((String) cities.get(i)));
                forecast.add(cityforecast);
    //           System.out.println(forecast.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

/*        int j = cities.size();
        WeatherInfo[] cityforecast = new WeatherInfo[j];

        for (int i = 0; i < cities.size(); i++) {
            try {
                cityforecast[i].setCity((String) cities.get(i));
                cityforecast[i].setTemperature(weatherApi.getTemperature((String) cities.get(i)));
                cityforecast[i].setDescription(weatherApi.getDescription((String) cities.get(i)));
                forecast.add(cityforecast[i]);
                System.out.println(forecast.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        return forecast;
    }

}
