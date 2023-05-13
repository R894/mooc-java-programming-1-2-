/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor(){
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    @Override
    public boolean isOn() {
        for(Sensor sensor : sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(x -> x.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(x -> x.setOff());
    }

    @Override
    public int read() {
        if(sensors.isEmpty() || !this.isOn()){
            throw new IllegalStateException();
        }
        int sum =0;
        for(Sensor sensor : sensors){
            sum += sensor.read();
        }
        readings.add(sum/sensors.size());
        return sum/sensors.size();
    }
    public List<Integer> readings(){
        
        return readings;
    }
    
}
