import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WeatherFileManager {
    String fileNameCities = "cities.txt";
    String fileNameForecast = "forecasts.csv";

    //pobieranie miast
    public List getCitiesFromFile() {

        List<String> cities = new ArrayList<>();

        try (
                FileReader fileReader = new FileReader(fileNameCities);
                BufferedReader reader = new BufferedReader(fileReader);
        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                cities.add(line);
            }
        } catch (
                FileNotFoundException e)

        {
            System.out.println("Brak pliku");
        } catch (
                NullPointerException e)

        {
            System.out.println("Brak danych do wczytania");
        } catch (
                IOException e)

        {
            System.out.println("Blad podczas wczytywania danych");
        }
        return cities;
    }


    //zapisywanie prognozy do pliku
    public void saveForecasts() {
        WeatherData weatherdata = new WeatherData();
        List newForecasts = weatherdata.getForecast();

        try (
                FileWriter fileWriter = new FileWriter(fileNameForecast);
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {

            for (int i = 0; i < newForecasts.size(); i++) {
                writer.write(newForecasts.get(i).toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Wystapil blad podczas zapisywania pliku");
        }
    }


/*   public void saveForecasts() {
        List<String> forecasts = new ArrayList<>();

        try (
               FileOutputStream fis = new FileOutputStream(fileNameForecast);
               ObjectOutputStream oos = new ObjectOutputStream(fis);
        ) {
            oos.writeObject(forecasts);
        } catch (IOException e){
            System.out.println("Wystapil blad podczas zapisywania pliku");
        }
    }*/

    /* public List getCitiesFromFile() {

        List<String> cities = new ArrayList<>();

        try (
                FileInputStream fis = new FileInputStream(fileNameCities);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            cities = (ArrayList<String>) ois.readObject();
        } catch (
                FileNotFoundException e)

        {
            System.out.println("Brak pliku");
        } catch (
                NullPointerException e)

        {
            System.out.println("Brak danych do wczytania");
        } catch (
                IOException e)

        {
            System.out.println("Blad podczas wczytywania danych");
        } catch (
                ClassNotFoundException e)

        {
            e.printStackTrace();
        }
        return cities;
    }*/
}