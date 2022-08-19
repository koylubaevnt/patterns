package ru.koylubaevnt.patterns.creational.factorymethod.factory;

import ru.koylubaevnt.patterns.creational.factorymethod.buttons.Button;
import ru.koylubaevnt.patterns.creational.factorymethod.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
