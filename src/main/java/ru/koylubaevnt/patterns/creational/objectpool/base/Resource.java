package ru.koylubaevnt.patterns.creational.objectpool.base;

public class Resource {

    private int value;

    public Resource() {
        this.value = 0;
    }

    public void reset() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "value=" + value +
                ", hash=" + this.hashCode() +
                '}';
    }
}
