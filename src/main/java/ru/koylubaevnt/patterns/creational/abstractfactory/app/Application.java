package ru.koylubaevnt.patterns.creational.abstractfactory.app;

import ru.koylubaevnt.patterns.creational.abstractfactory.buttons.Button;
import ru.koylubaevnt.patterns.creational.abstractfactory.checkboxes.Checkbox;
import ru.koylubaevnt.patterns.creational.abstractfactory.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {

    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
