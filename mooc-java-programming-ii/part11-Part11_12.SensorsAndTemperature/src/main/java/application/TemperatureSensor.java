
package application;

import java.util.Random;


public class TemperatureSensor implements Sensor {
    private boolean sensor;
    public TemperatureSensor(){
        sensor = false;
    }
    @Override
    public boolean isOn() {
        return sensor;
    }

    @Override
    public void setOn() {
        sensor = true;
    }

    @Override
    public void setOff() {
        sensor = false;
    }

    @Override
    public int read() {
        if(sensor ==false){
            throw new IllegalStateException();
        }
        int num =  new Random().nextInt(61);
        return num -30;
    }
    
}
