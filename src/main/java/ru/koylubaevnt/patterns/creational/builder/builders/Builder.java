package ru.koylubaevnt.patterns.creational.builder.builders;

import ru.koylubaevnt.patterns.creational.builder.cars.*;
import ru.koylubaevnt.patterns.creational.builder.components.Engine;
import ru.koylubaevnt.patterns.creational.builder.components.GPSNavigator;
import ru.koylubaevnt.patterns.creational.builder.components.Transmission;
import ru.koylubaevnt.patterns.creational.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
