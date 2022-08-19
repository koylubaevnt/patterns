package ru.koylubaevnt.patterns.creational.abstractfactory;

import ru.koylubaevnt.patterns.creational.abstractfactory.app.Application;
import ru.koylubaevnt.patterns.creational.abstractfactory.factories.GUIFactory;
import ru.koylubaevnt.patterns.creational.abstractfactory.factories.MacOSFactory;
import ru.koylubaevnt.patterns.creational.abstractfactory.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication(String[] args) {
        Application app;
        GUIFactory factory;

        if (args.length > 0) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication(args);
        app.paint();
    }
}
