package ru.koylubaevnt.patterns.creational.builder.cars;

import ru.koylubaevnt.patterns.creational.builder.components.Engine;
import ru.koylubaevnt.patterns.creational.builder.components.GPSNavigator;
import ru.koylubaevnt.patterns.creational.builder.components.Transmission;
import ru.koylubaevnt.patterns.creational.builder.components.TripComputer;

/**
 * Автомобиль — это класс продукта.
 */
public class Car {

    private CarType carType;

    private int seats;

    private Engine engine;

    private Transmission transmission;

    private TripComputer tripComputer;

    private GPSNavigator gpsNavigator;

    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
