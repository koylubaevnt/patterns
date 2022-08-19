package ru.koylubaevnt.patterns.creational.factorymethod;

import ru.koylubaevnt.patterns.creational.factorymethod.factory.Dialog;
import ru.koylubaevnt.patterns.creational.factorymethod.factory.HtmlDialog;
import ru.koylubaevnt.patterns.creational.factorymethod.factory.WindowsDialog;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure(args);
        runBusinessLogic();
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    private static void configure(String[] args) {
        if (args.length > 0) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
