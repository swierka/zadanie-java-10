import java.util.ArrayList;
import java.util.List;

public class WeatherPro {
    public static void main(String[] args) {

        WeatherFileManager weatherFileManager = new WeatherFileManager();
        WeatherData weatherdata = new WeatherData();
        List newForecasts = weatherdata.getForecast();

    }
}
