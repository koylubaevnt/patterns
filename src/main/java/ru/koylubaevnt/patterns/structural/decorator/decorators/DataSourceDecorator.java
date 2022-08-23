package ru.koylubaevnt.patterns.structural.decorator.decorators;

/**
 * Базовый декоратор
 */
public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
