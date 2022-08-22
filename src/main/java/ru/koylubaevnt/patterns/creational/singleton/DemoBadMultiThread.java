package ru.koylubaevnt.patterns.creational.singleton;

import ru.koylubaevnt.patterns.creational.singleton.nonthreadsafe.Singleton;

/**
 * Клиентский код
 *
 * Тот же класс ведёт себя неправильно в многопоточной среде.
 * Несколько потоков могут одновременно вызвать метод получения Одиночки и создать сразу несколько экземпляров объекта.
 */
public class DemoBadMultiThread {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        for (int i = 0; i < 20; i++) {
            Thread threadFoo = new Thread(new ThreadFoo());
            Thread threadBar = new Thread(new ThreadBar());
            threadFoo.start();
            threadBar.start();
        }
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
