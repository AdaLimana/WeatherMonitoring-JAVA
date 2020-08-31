import java.util.ArrayList;

/**
 *
 * @author adair
 */
public class WeatherData implements Observable{

    private ArrayList<Observer> observers;
    
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        this.observers = new ArrayList<Observer>();
    }
    
    public void registerObserver(Observer o){
        this.observers.add(o);
    }
    
    public void removeObserver(Observer o){
        this.observers.remove(o);
    }
    
    public void notifyObservers(Object args){
        
        for(Observer o: this.observers){
            o.update(this, args);
        }
    }
    
    public void measurementsChanged(){
        this.notifyObservers(null);
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
    
    
}
