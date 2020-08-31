/**
 *
 * @author adair
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement
{

    private float temperature;
    
    private float humidity;
    
    private WeatherData weatherData;    
    
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(Observable observable, Object arg) {
        
        this.temperature = ((WeatherData)observable).getTemperature();
        this.humidity = ((WeatherData)observable).getHumidity();
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }    
}