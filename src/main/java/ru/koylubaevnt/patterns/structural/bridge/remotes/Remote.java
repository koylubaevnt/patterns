package ru.koylubaevnt.patterns.structural.bridge.remotes;

/**
 * Общий интерфейс всех пультов ДУ
 */
public interface Remote {

    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
