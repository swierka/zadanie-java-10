package Zad2.App;

import Zad2.io.WeatherFileManager;

public class WeatherPro {
    public static void main(String[] args) {

        WeatherFileManager fileManager = new WeatherFileManager();
        fileManager.saveForecasts();
    }
}
