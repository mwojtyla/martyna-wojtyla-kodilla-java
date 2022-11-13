package com.kodilla.testing.weather.stub;

import java.lang.reflect.Array;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    double sum = 0;
    double average = 0;
    public double averageTemperature(){
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
                sum = sum + temperature.getValue();
                average = sum/temperatures.getTemperatures().entrySet().size();

        }
        return average;
    }

    public double medianTemperatures(){
        Map<String, Double> newMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            newMap.put(temperature.getKey(), temperature.getValue());
        }
        List<Double> temperaturesList = new ArrayList<>(newMap.values());
        Collections.sort(temperaturesList);
        int n = temperaturesList.size();
        double mediana;
        if(temperaturesList.isEmpty()){
            throw new IllegalArgumentException("Cannot compute median on empty array of numbers");
        }
        if (n%2 == 0) {
            mediana = (temperaturesList.get((n/2)) + temperaturesList.get((n/2)-1))/2;
            } else {
            mediana = temperaturesList.get((n-1)/2);
            }
        return mediana;

    }
}
