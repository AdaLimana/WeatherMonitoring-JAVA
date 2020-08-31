/**
 *
 * @author adair
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndex = new HeatIndexDisplay(weatherData);
        
        weatherData.setMeasurements(87, 60, 30);
        weatherData.setMeasurements(75, 55, 28);
        
    }
    
}
