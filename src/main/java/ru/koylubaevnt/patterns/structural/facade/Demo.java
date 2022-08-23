package ru.koylubaevnt.patterns.structural.facade;

import ru.koylubaevnt.patterns.structural.facade.facade.VideoConversionFacade;

import java.io.File;

/**
 *  Клиентский код
 */
public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
