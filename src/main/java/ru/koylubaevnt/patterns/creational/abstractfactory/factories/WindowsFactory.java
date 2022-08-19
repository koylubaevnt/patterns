package ru.koylubaevnt.patterns.creational.abstractfactory.factories;

import ru.koylubaevnt.patterns.creational.abstractfactory.buttons.Button;
import ru.koylubaevnt.patterns.creational.abstractfactory.buttons.WindowsButton;
import ru.koylubaevnt.patterns.creational.abstractfactory.checkboxes.Checkbox;
import ru.koylubaevnt.patterns.creational.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
