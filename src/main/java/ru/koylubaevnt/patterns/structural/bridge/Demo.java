package ru.koylubaevnt.patterns.structural.bridge;

import ru.koylubaevnt.patterns.structural.bridge.devices.Device;
import ru.koylubaevnt.patterns.structural.bridge.devices.Radio;
import ru.koylubaevnt.patterns.structural.bridge.devices.Tv;
import ru.koylubaevnt.patterns.structural.bridge.remotes.AdvancedRemote;
import ru.koylubaevnt.patterns.structural.bridge.remotes.BasicRemote;

/**
 *  Клиентский код
 */
public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
