package ru.koylubaevnt.patterns.structural.decorator.decorators;

/**
 * Интерфейс, задающий базовые операции чтения и записи данных
 */
public interface DataSource {

    void writeData(String data);

    String readData();
}
