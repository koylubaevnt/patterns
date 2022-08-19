package ru.koylubaevnt.patterns.creational.factorymethod.buttons;

/**
 * Реализация HTML кнопок.
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! button says - 'Hello World!'");
    }
}
