package ru.koylubaevnt.patterns.structural.bridge.devices;

/**
 * Общий интерфейс всех устройств
 */
public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
