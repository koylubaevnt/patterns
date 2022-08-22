package ru.koylubaevnt.patterns.creational.singleton.nonthreadsafe;

/**
 *  Одиночка
 *
 *  Топорно реализовать Одиночку очень просто —
 *  достаточно скрыть конструктор и предоставить статический создающий метод.
 */
public class Singleton {

    private static Singleton instance;

    public String value;

    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
