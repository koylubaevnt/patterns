package ru.koylubaevnt.patterns.creational.abstractfactory.factories;

import ru.koylubaevnt.patterns.creational.abstractfactory.buttons.Button;
import ru.koylubaevnt.patterns.creational.abstractfactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

}
