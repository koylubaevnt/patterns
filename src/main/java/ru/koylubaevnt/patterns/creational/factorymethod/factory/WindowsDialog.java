package ru.koylubaevnt.patterns.creational.factorymethod.factory;

import ru.koylubaevnt.patterns.creational.factorymethod.buttons.Button;
import ru.koylubaevnt.patterns.creational.factorymethod.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
